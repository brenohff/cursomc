package com.brenohff.cursomc.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
public class ErrorDTO {
    private String titulo;
    private HttpStatus status;
    private Long timestamp;
    private String mensagemDesenvolvedor;
}
