package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class RendaClienteNaoInformadaException extends NegocioException {
	private static final long serialVersionUID = 1L;

	public RendaClienteNaoInformadaException(String message) {
		super(message);
	}
}
