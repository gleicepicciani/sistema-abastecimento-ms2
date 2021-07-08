package com.ifms.services.exceptions;

//recurso solicitado e nao encontrado
public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String msg) {
	    super(msg);
	}	
}