package br.com.javaweb.mdigital.rule.cliente;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.TelefoneClienteNaoInformadoException;

@Component
public class TelefoneClienteNaoInformadoRule {
	
	public void valida(String telefone) {
		if (telefone.isEmpty()) {
			throw new TelefoneClienteNaoInformadoException("Telefone do cliente não foi informado!");
		}
	}
}
