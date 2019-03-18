package com.teste.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.model.Pessoa;
import com.teste.teste.service.PessoaService;

/**
 * Pessoa Controller
 * 
 * @author gustavoclay
 *
 */

@RestController
@RequestMapping("/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@PostMapping
	public ResponseEntity<?> salvar(@RequestBody Pessoa pessoa) {
		try {
			pessoaService.salvarpessoa(pessoa);
			if(pessoaService.getErros())
		}
		
	}
}
