package br.com.javaweb.mdigital.exception.cliente;

import br.com.javaweb.mdigital.exception.NegocioException;

public class TelefoneClienteNaoInformadoException extends NegocioException {
	private static final long serialVersionUID = -9146638574004967881L;

	public TelefoneClienteNaoInformadoException(String message) {
		super(message);
	}
}
