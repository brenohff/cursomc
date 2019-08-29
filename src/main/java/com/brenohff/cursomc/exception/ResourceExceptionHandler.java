package com.brenohff.cursomc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<ErrorDTO> ObjectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(getBadRequest(HttpStatus.NOT_FOUND, e.getMessage()));
    }

    private ErrorDTO getBadRequest(HttpStatus status, String error) {
        ErrorDTO erro = new ErrorDTO();
        erro.setStatus(status);
        erro.setTitulo(error);
        erro.setMensagemDesenvolvedor("http://brenohff.com/");
        erro.setTimestamp(System.currentTimeMillis());
        return erro;
    }

}