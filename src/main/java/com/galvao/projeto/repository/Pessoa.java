package com.galvao.projeto.repository;

import com.galvao.projeto.repository.Pessoa.AllArgsConstructor;
import com.galvao.projeto.repository.Pessoa.EqualsAndHashCode;
import com.galvao.projeto.repository.Pessoa.NoArgsConstructor;

import jakarta.persistence;
import jakarta.persistence.GeneratedValue;
import lombok;


@Table(name"pessoa")
@Entity(name"pessoa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {


	public @interface AllArgsConstructor {

	}

	public @interface NoArgsConstructor {

	}

	public @interface EqualsAndHashCode {

	}

	public @interface Setter {

	}

	public @interface Getter {

	}

	@Id @GeneratedValue(strategy = GenerationType.UUID)
	private Integer id;
	
	private String name;
	
	private Integer idade;
	
	//public Int getId() {
		//return id;
	//}

	//public void setId(Int id) {
		//this.id = id;
	//}

	//public String getName() {
		//return name;
	//}

	//public void setName(String name) {
		//this.name = name;
	//}

	//public Number getIdade() {
		//return idade;
	//}

	//public void setIdade(Number idade) {
		//this.idade = idade;
	//}

	//public Pessoa(Int id, String name, Int idade) {
		//this.id = id;
		//this.name = name;
		//this.idade = idade;
		
	public Pessoa(RequestPessoa requestPessoa ) {
		this.name = requestPessoa.name();
		this.idade = requestPessoa.idade();
	}
	
}
