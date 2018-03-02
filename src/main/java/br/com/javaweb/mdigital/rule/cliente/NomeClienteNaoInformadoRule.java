package br.com.javaweb.mdigital.rule.cliente;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.NomeClienteNaoInformadoException;

@Component
public class NomeClienteNaoInformadoRule {
	
	public void valida(String nome) {
		Optional.ofNullable(nome).orElseThrow(() -> new NomeClienteNaoInformadoException("Nome do cliente não foi informado."));
	}
}
