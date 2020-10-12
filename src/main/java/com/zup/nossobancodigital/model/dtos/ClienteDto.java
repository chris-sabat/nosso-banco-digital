package com.zup.nossobancodigital.model.dtos;

import com.zup.nossobancodigital.model.validation.OverDate18Years;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@Data
public class ClienteDto {

    private Long id;

    @NotEmpty
    private String nomeCliente;

    @NotEmpty
    private String sobrenomeCliente;

    @NotEmpty
    private String email;

    @NotEmpty
    private String cnh;

    @OverDate18Years
    private LocalDate dataNascimento;
}
