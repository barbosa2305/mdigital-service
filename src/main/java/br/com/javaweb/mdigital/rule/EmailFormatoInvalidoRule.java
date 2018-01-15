package br.com.javaweb.mdigital.rule;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.exception.EmailFormatoInvalidoException;

@Component
public class EmailFormatoInvalidoRule {
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
										        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public void valida(String email) {
		if (!email.matches(EMAIL_PATTERN)) {
			throw new EmailFormatoInvalidoException("E-mail com formato inválido.");
		}
	}
}
