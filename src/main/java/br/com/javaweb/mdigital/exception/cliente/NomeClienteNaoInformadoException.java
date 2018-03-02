package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class NomeClienteNaoInformadoException extends NegocioException {
	private static final long serialVersionUID = 7715168634582421128L;

	public NomeClienteNaoInformadoException(String message) {
		super(message);
	}
}
