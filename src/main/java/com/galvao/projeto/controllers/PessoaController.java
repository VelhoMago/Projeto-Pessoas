package com.galvao.projeto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galvao.projeto.service.PessoaService;


public class PessoaController<RequestPessoa> {
	
	@Autowired	private PessoaService
	
@GetMapping
public ResponseEntity selecionar(@PathVariable Integer RequestBody @Valid RequestPessoa data) {
		Pessoa pessoa = pessoaService.getAllPessoa(id);
	pessoaService.getAllPessoa();	
}
@PostMapping
public ResponseEntity criar(@PathVarible Integer @RequestBody @Valid RequestPessoa data) {
	pessoaService.registerPessoa();	
}

@PutMapping("/{id}")
public ResponseEntity alterar(@RequestBody @Valid RequestPessoa) {
	pessoaService.updatePessoa();
}
	
@DeleteMapping(path = "/{id}")
public ResponseEntity deletar(@PathVariable int id) {
	pessoaService.deletePessoa();
	}
}