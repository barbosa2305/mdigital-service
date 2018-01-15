package br.com.javaweb.mdigital.rule.cliente;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.RendaClienteNaoInformadaException;

@Component
public class RendaClienteNaoInformadaRule {
	
	public void valida(BigDecimal rendaBruta) {
		if (rendaBruta.signum() <= 0) {
			throw new RendaClienteNaoInformadaException("Renda bruta do cliente não foi informada.");
		}
	}
}
