package br.com.javaweb.mdigital.rule.cliente;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.NomeClienteNaoInformadoException;

@Component
public class NomeClienteNaoInformadoRule {
	
	public void valida(String nome) {
		if (nome.isEmpty()) {
			throw new NomeClienteNaoInformadoException("Nome do cliente não foi informado.");
		}
	}
}
