package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class EmailClienteNaoInformadoException extends NegocioException {
	private static final long serialVersionUID = -4062403190580440975L;

	public EmailClienteNaoInformadoException(String message) {
		super(message);
	}
}
