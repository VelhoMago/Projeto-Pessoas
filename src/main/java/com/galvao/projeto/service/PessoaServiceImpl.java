package com.galvao.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

public class PessoaServiceImpl<RequestPessoa> implements PessoaService {
	
	@Autowired private PessoaRepository;
	@Autowired private PapelService papelService;
	@Autowired private Pessoa;
	
	@Autowired
	private PessoaRepository
	
@GetMapping
public ResponseEntity getAllPessoa() {
		var allPessoa = repository.findAll();
	return ResponseEntity.ok(body: "deu ok");
	
}
	
@PostMapping
public ResponseEntity registerPessoa(@PathVariable Integer @RequestBody @Valid RequestPessoa data) {
	System.out.Println(data);
	repository.save(newPessoa);
	return ResponseEntity.ok().build();
		
}
	
@PutMapping("/{id}")
public ResponseEntity updatePessoa(@RequestBody @Valid RequestPessoa) {
	Pessoa pessoa = repository.getReferenceById();
	pessoa.setName(data.name());
	pessoa.setIdade(data.idade());
	return ResponseEntity.ok(pessoa);
}
	
@DeleteMapping(path = "/{id}")
public ResponseEntity deletePessoa(@PathVariable int id) {
	pessoaRepository.deleteById(id);
}
}
