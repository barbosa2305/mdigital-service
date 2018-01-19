package br.com.javaweb.mdigital.exception.maladireta;

import br.com.javaweb.mdigital.exception.NegocioException;

public class MalaDiretaNaoEncontradaException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public MalaDiretaNaoEncontradaException(String message) {
		super(message);
	}
}
