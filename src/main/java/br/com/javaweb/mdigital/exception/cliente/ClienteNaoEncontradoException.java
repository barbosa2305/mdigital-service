package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class ClienteNaoEncontradoException extends NegocioException {
	private static final long serialVersionUID = 5965552772106692617L;

	public ClienteNaoEncontradoException(String message) {
		super(message);
	}
}
