package com.br.API.com.CRUD.REST.domain.service;

import java.util.List;

import com.br.API.com.CRUD.REST.domain.model.Cliente;

public interface ClienteService {

	List<Cliente> findAll();
	Cliente salvar(Cliente cliente);
	Cliente findById(Long id);
	Cliente atualizar(Long id, Cliente cliente);
	void deletarPorId(Long id);
}