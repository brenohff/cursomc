package com.brenohff.cursomc.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 8950375360783014470L;

	public ObjectNotFoundException(String mensagem) {
		super(mensagem);
	}

	public ObjectNotFoundException(String mensagem, Throwable motivo) {
		super(mensagem, motivo);
	}

}
