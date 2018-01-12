package br.com.javaweb.mdigital.exception.maladireta;

import br.com.javaweb.mdigital.exception.NegocioException;

public class FaixaRendaFinalNaoInformadaException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public FaixaRendaFinalNaoInformadaException(String message) {
		super(message);
	}
}
