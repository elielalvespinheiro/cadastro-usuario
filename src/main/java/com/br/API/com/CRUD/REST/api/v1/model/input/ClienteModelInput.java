package com.br.API.com.CRUD.REST.api.v1.model.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteModelInput {

	private String nome;
	private String email;
	private int idade;
	private String pais;
	private String cidade;
	private String endereco;
}