package com.zup.nossobancodigital.services;

import com.zup.nossobancodigital.exceptions.ClienteNotFoundException;
import com.zup.nossobancodigital.mappers.MapperCliente;
import com.zup.nossobancodigital.model.Cliente;
import com.zup.nossobancodigital.model.dtos.ClienteDto;
import com.zup.nossobancodigital.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MapperCliente mapperCliente;

    public ClienteDto salvar(ClienteDto clienteDto){
        Cliente cliente = mapperCliente.toEntity(clienteDto);

        clienteRepository.save(cliente);

        return mapperCliente.toDto(cliente);
    }

    public ClienteDto obter(Long id){
        Cliente cliente = clienteRepository.findById(id).get();

        if( cliente == null ){
            throw new ClienteNotFoundException("Cliente não foi encontrado no banco de dados para este id.");
        }

        return mapperCliente.toDto(cliente);
    }
}
