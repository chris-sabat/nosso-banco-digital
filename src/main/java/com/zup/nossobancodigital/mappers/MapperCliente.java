package com.zup.nossobancodigital.mappers;

import com.zup.nossobancodigital.model.Cliente;
import com.zup.nossobancodigital.model.dtos.ClienteDto;
import org.mapstruct.Mapper;

@Mapper
public interface MapperCliente {
    Cliente toEntity(ClienteDto clienteDto);
    ClienteDto toDto(Cliente cliente);
}
