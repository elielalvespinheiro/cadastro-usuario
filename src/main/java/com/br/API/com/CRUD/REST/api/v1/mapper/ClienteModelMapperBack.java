package com.br.API.com.CRUD.REST.api.v1.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.API.com.CRUD.REST.api.v1.model.input.ClienteModelInput;
import com.br.API.com.CRUD.REST.domain.model.Cliente;

@Component
public class ClienteModelMapperBack {

	@Autowired
	ModelMapper modelMapper;

public Cliente toModel(ClienteModelInput clienteModelInput) {
		Cliente cliente =
				modelMapper.map(clienteModelInput, Cliente.class);
		return cliente;
	}
}
