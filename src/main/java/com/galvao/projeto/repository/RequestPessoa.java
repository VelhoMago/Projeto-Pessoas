package com.galvao.projeto.repository;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestPessoa(
		
		Integer id,
		@NotBlank
		String name,
		@NotNull
		Integer idade) {

}
