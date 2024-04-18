package com.br.API.com.CRUD.REST.api.v1.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteModel {

	private Long id;
	private String nome;
	private String email;
	private int idade;
	private String pais;
}
