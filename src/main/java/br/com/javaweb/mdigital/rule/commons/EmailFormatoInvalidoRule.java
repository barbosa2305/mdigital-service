package br.com.javaweb.mdigital.rule.commons;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.commons.EmailFormatoInvalidoException;

@Component
public class EmailFormatoInvalidoRule {
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
										        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public void valida(String email) {
		if (!EMAIL_PATTERN.matches(email)) {
			throw new EmailFormatoInvalidoException("E-mail com formato inválido.");
		}
	}
}
