package com.brenohff.cursomc.exception;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1L;

    private HttpStatus status;
    private String message;
    private Long timestamp;
}
