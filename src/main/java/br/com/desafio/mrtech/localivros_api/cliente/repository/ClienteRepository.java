package br.com.desafio.mrtech.localivros_api.cliente.repository;

import br.com.desafio.mrtech.localivros_api.cliente.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
