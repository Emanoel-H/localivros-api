package br.com.desafio.mrtech.localivros_api.cliente.repository;

import br.com.desafio.mrtech.localivros_api.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {
}
