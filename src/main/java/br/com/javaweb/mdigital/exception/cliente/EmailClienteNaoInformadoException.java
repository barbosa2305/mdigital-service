package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class EmailClienteNaoInformadoException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public EmailClienteNaoInformadoException(String message) {
		super(message);
	}
}
