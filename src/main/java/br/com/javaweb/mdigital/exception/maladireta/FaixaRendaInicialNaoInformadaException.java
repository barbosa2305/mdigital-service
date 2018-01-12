package br.com.javaweb.mdigital.exception.maladireta;

import br.com.javaweb.mdigital.exception.NegocioException;

public class FaixaRendaInicialNaoInformadaException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public FaixaRendaInicialNaoInformadaException(String message) {
		super(message);
	}
}
