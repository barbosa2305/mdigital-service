package br.com.javaweb.mdigital.exception.commons;

import br.com.javaweb.mdigital.exception.NegocioException;

public class EmailFormatoInvalidoException extends NegocioException {
	private static final long serialVersionUID = -6043929845475135130L;

	public EmailFormatoInvalidoException(String message) {
		super(message);
	}
}
