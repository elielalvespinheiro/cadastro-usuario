package com.br.API.com.CRUD.REST.api.v1.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.API.com.CRUD.REST.api.v1.model.ClienteModel;
import com.br.API.com.CRUD.REST.domain.model.Cliente;

@Component
public class ClienteModelMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	public ClienteModel toModel(Cliente cliente) {
		ClienteModel clienteModel = 
				modelMapper.map(cliente, ClienteModel.class);
		return clienteModel;
	
	}
}