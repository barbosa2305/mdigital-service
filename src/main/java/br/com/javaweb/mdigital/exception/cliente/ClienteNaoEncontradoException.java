package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class ClienteNaoEncontradoException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public ClienteNaoEncontradoException(String message) {
		super(message);
	}
}
