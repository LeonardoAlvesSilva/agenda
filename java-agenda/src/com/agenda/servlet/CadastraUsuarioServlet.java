package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

public class CadastraUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = -3439992183507416139L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		CadastraUsuarioService service = new CadastraUsuarioService();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome(request.getParameter("name"));
		pessoa.setTelefone(request.getParameter("telefone"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setEndereco(request.getParameter("endereco"));


		if (null != request.getParameter("id") && !request.getParameter("id").equals("")) {

			pessoa.setId(Long.parseLong(request.getParameter("id")));
			
		}
		service.cadastrarOuAlterar(pessoa);
		
		response.sendRedirect("busca-contatos");

	}

}
