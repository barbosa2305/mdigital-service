package br.com.javaweb.mdigital.rule.maladireta;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.maladireta.FaixaRendaFinalNaoInformadaException;
import br.com.javaweb.mdigital.exception.maladireta.FaixaRendaInicialNaoInformadaException;

@Component
public class FaixaRendaNaoInformadaRule {

	public void valida(BigDecimal faixaRendaInicial, BigDecimal faixaRendaFinal) {
		Optional.ofNullable(faixaRendaInicial).orElseThrow(() -> new FaixaRendaInicialNaoInformadaException("Faixa de renda inicial não foi informada."));
		Optional.ofNullable(faixaRendaFinal).orElseThrow(() -> new FaixaRendaFinalNaoInformadaException("Faixa de renda final não foi informada."));
	}
}
