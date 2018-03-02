package br.com.javaweb.mdigital.rule.maladireta;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.maladireta.NomeMalaDiretaNaoInformadoException;

@Component
public class NomeMalaDiretaNaoInformadoRule {

	public void valida(String nome) {
		Optional.ofNullable(nome).orElseThrow(() -> new NomeMalaDiretaNaoInformadoException("Nome da mala direta não foi informado."));
	}
}
