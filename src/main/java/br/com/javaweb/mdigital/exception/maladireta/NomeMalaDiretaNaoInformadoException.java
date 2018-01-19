package br.com.javaweb.mdigital.exception.maladireta;

import br.com.javaweb.mdigital.exception.NegocioException;

public class NomeMalaDiretaNaoInformadoException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public NomeMalaDiretaNaoInformadoException(String message) {
		super(message);
	}
}
