package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDAO;
import com.agenda.model.Pessoa;

public class CadastraUsuarioService {
	
	private PessoaDAO dao = new PessoaDAO();

	public void cadastraOuAlterar(Pessoa pessoa) {
		if(0 != pessoa.getId()) {
			this.alterar(pessoa);
		}else {
			this.dao.cadastro(pessoa);
		}
	}
		
	
	public List<Pessoa> buscaPessoas() {
		return this.dao.buscaPessoas();
		}

	public void removeContato(Pessoa pessoa) {
		dao.remove(pessoa);
	}
	
	public void alterar(Pessoa pessoa) {
		this.dao.alterar(pessoa);
	}
}