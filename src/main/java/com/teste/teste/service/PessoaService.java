package com.teste.teste.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.teste.model.Pessoa;
import com.teste.teste.repository.PessoaRepository;

@Service
public class PessoaService {
	
	protected Map<String, String> erros = new HashMap<>();

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa salvarpessoa(Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	public List<String> getErros() {
		return 
	}
}
