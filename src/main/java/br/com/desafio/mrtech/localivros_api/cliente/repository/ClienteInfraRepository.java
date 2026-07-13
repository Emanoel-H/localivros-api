package br.com.desafio.mrtech.localivros_api.cliente.repository;

import br.com.desafio.mrtech.localivros_api.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
@Log4j2
public class ClienteInfraRepository implements ClienteRepository{
    private final ClienteSpringDataJpaRepository repository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - cadastraNovoColiente");
        Cliente clienteSalvo = repository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - cadastraNovoColiente");
        return clienteSalvo;
    }
}
