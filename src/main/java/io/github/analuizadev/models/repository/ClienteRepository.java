package io.github.analuizadev.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.analuizadev.models.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}