package br.com.javaweb.mdigital.cmd.maladireta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.builder.MalaDiretaTOBuilder;
import br.com.javaweb.mdigital.dao.MalaDiretaDAO;
import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.rule.maladireta.MalaDiretaNaoEncontradaRule;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Component
public class GetMalaDiretaCmd {

	@Autowired
	private MalaDiretaDAO malaDiretaDAO;
	
	@Autowired
	private MalaDiretaNaoEncontradaRule malaDiretaNaoEncontradaRule;
	
	@Autowired
	private MalaDiretaTOBuilder malaDiretaTOBuilder;
	
	public MalaDiretaTO get(Integer idMalaDireta) {
		MalaDireta malaDireta = malaDiretaDAO.getPorCodigo(idMalaDireta);
		
		malaDiretaNaoEncontradaRule.valida(malaDireta);
		
		return malaDiretaTOBuilder.build(malaDireta);
	}
}
