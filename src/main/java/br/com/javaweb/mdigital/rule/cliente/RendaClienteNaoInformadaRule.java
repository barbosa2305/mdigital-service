package br.com.javaweb.mdigital.rule.cliente;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.cliente.RendaClienteNaoInformadaException;

@Component
public class RendaClienteNaoInformadaRule {

	public void valida(BigDecimal rendaBruta) {
		Optional.ofNullable(rendaBruta).orElseThrow(() -> new RendaClienteNaoInformadaException("Renda bruta do cliente não foi informada."));
	}
}
