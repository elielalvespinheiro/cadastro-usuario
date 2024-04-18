package com.br.API.com.CRUD.REST.api.v1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.br.API.com.CRUD.REST.api.v1.mapper.*;
import com.br.API.com.CRUD.REST.api.v1.model.ClienteModel;
import com.br.API.com.CRUD.REST.api.v1.model.input.ClienteModelInput;
import com.br.API.com.CRUD.REST.domain.model.Cliente;
import com.br.API.com.CRUD.REST.domain.service.ClienteService;

@RestController
@RequestMapping("/v1/cliente")

public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ClienteModelMapper clienteModelMapper;
	
	@Autowired
	private ClienteModelMapperBack clienteModelMapperBack;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Cliente>> Listar(Cliente cliente) {
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.findAll());	
	}
	
	@GetMapping("/buscar/{id}")
	public ResponseEntity<Cliente> buscarporIdCliente(@PathVariable(name = "id") Long id) {
		Cliente cliente = clienteService.findById(id);
		return ResponseEntity.status(HttpStatus.OK).body(cliente);
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<ClienteModel> cadastrarCliente(@RequestBody @Valid ClienteModelInput clienteModelInput){
	 Cliente cliente = clienteModelMapperBack.toModel(clienteModelInput);
	 ClienteModel clienteModel = clienteModelMapper.toModel(clienteService.salvar(cliente));
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteModel);	
	}
	
	@PatchMapping("/atualizar/{id}")
	public ResponseEntity<ClienteModel> atualizar(@RequestBody @Valid
		ClienteModelInput userModelInput, @PathVariable("id") Long id) {
		Cliente user = clienteModelMapperBack.toModel(userModelInput);
		ClienteModel userModel = clienteModelMapper.toModel(clienteService.atualizar(id,user));
		return ResponseEntity.status(HttpStatus.CREATED).body(userModel);
	}

	
}
