package br.com.javaweb.mdigital.rule.maladireta;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.exception.maladireta.MalaDiretaNaoEncontradaException;

@Component
public class MalaDiretaNaoEncontradaRule {
	
	public void valida(MalaDireta malaDireta) {
		if (malaDireta == null) {
			throw new MalaDiretaNaoEncontradaException("Mala direta não foi encontrada.");
		}
	}
}
