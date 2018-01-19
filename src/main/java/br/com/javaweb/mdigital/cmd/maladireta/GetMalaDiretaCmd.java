package br.com.javaweb.mdigital.cmd.maladireta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
	
	public MalaDiretaTO get(Integer idMalaDireta) {
		MalaDireta malaDireta = malaDiretaDAO.getPorCodigo(idMalaDireta);
		
		malaDiretaNaoEncontradaRule.valida(malaDireta);
		
		return new MalaDiretaTO(malaDireta.getId(), malaDireta.getNome(), 
							malaDireta.getFaixaRendaInicial(), malaDireta.getFaixaRendaFinal());
	}
}
