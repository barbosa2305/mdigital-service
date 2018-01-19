package br.com.javaweb.mdigital.rule.maladireta;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.maladireta.FaixaRendaFinalNaoInformadaException;
import br.com.javaweb.mdigital.exception.maladireta.FaixaRendaInicialNaoInformadaException;

@Component
public class FaixaRendaNaoInformadaRule {
	
	public void valida(BigDecimal faixaRendaInicial, BigDecimal faixaRendaFinal) {
		if (faixaRendaInicial.signum() < 0) {
			throw new FaixaRendaInicialNaoInformadaException("Faixa de renda inicial não foi informada.");
		}
		
		if (faixaRendaFinal.signum() <= 0 ) {
			throw new FaixaRendaFinalNaoInformadaException("Faixa de renda final não foi informada.");
		}
	}
}
