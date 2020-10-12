package com.zup.nossobancodigital.controllers;

import com.zup.nossobancodigital.model.dtos.ClienteDto;
import com.zup.nossobancodigital.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> salvar(@Valid @RequestBody ClienteDto ClienteDto){
        ClienteDto clienteSavo = clienteService.salvar(ClienteDto);

        return ResponseEntity.ok( clienteSavo );
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDto> obterCliente( @PathVariable Long id ){
        ClienteDto clienteDto = clienteService.obter(id);
        return ResponseEntity.ok( clienteDto );
    }
}