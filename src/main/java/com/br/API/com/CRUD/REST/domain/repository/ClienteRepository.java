package com.br.API.com.CRUD.REST.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.API.com.CRUD.REST.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
