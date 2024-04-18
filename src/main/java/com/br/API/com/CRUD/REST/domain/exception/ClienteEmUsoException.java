package com.br.API.com.CRUD.REST.domain.exception;

public class ClienteEmUsoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ClienteEmUsoException(String mensagem) {
		super(mensagem);
	}
}
