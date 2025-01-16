package com.galvao.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.galvao.projeto.controllers.PathVarible;
import com.galvao.projeto.controllers.RequestBody;
import com.galvao.projeto.controllers.RequestPessoa;
import com.galvao.projeto.controllers.Valid;
import com.galvao.projeto.repository.Pessoa;
import com.galvao.projeto.repository.PessoaRepository;


public interface PessoaService {

	@Autowired
	private PessoaRepository
	
	public void selecionar(ResponseEntity RequestBody @Valid RequestPessoa data);
	public void criar(ResponseEntity RequestBody @Valid RequestPessoa data);
	public void alterar(ResponseEntity RequestBody @Valid RequestPessoa data);
	public void deletar(RequestEntity RequestBody @Valid RequestPessoa data);
}