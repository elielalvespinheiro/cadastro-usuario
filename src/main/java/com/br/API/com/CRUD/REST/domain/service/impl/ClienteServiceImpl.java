package com.br.API.com.CRUD.REST.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.API.com.CRUD.REST.domain.exception.ClienteNaoExisteException;
import com.br.API.com.CRUD.REST.domain.model.Cliente;
import com.br.API.com.CRUD.REST.domain.repository.ClienteRepository;
import com.br.API.com.CRUD.REST.domain.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		Cliente salva = clienteRepository.save(cliente);
	
		return salva;
	}

	@Override
	public Cliente findById(Long id) {
		Cliente achar = clienteRepository.findById(id)
				.orElseThrow(() -> new ClienteNaoExisteException("Cliente informa não encontrado: " + id)); 
		return achar;
	}
	@Override
	public Cliente atualizar(Long id, Cliente cliente) {
		Cliente att = clienteRepository.findById(id)
				.orElseThrow(() -> new ClienteNaoExisteException("Cliente não encontrado: " + id));
		
		att.setNome(cliente.getNome());
		att.setEmail(cliente.getEmail());
		att.setIdade(cliente.getIdade());
		att.setPais(cliente.getPais());
		
		return clienteRepository.save(att);
	}

	@Override
	public void deletarPorId(Long id) {
		clienteRepository.findById(id)
				.orElseThrow(() -> new ClienteNaoExisteException("O cliente informado, para apagar, não foi encontrado " ));
		clienteRepository.deleteById(id);
		
	}
}
