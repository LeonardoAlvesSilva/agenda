package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.model.Pessoa;
import com.agenda.service.CadastraUsuarioService;

@WebServlet("/remover-contatos")
public class RemoveContatoServelet extends HttpServlet {

	@Override
	protected void service (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	CadastraUsuarioService service = new CadastraUsuarioService();
	
	
	long id = Long.parseLong(request.getParameter("id"));
	
	
	Pessoa pessoa = new Pessoa();
	pessoa.setId(id);
	
	
	
	
	
	service.removeContato (pessoa);
	
	response.sendRedirect("busca-contatos");
	
	
	}
	
}
