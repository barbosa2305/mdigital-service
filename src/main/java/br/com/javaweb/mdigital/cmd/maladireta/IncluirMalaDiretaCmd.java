package br.com.javaweb.mdigital.cmd.maladireta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.MalaDiretaDAO;
import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.rule.maladireta.FaixaRendaNaoInformadaRule;
import br.com.javaweb.mdigital.rule.maladireta.NomeMalaDiretaNaoInformadoRule;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Component
public class IncluirMalaDiretaCmd {

	@Autowired
	private MalaDiretaDAO malaDiretaDAO;
	
	@Autowired
	private NomeMalaDiretaNaoInformadoRule nomeMalaDiretaNaoInformadoRule;
	
	@Autowired
	private FaixaRendaNaoInformadaRule faixaRendaNaoInformadaRule;
	
	public MalaDiretaTO incluir(MalaDiretaTO malaDiretaTO) {
		nomeMalaDiretaNaoInformadoRule.valida(malaDiretaTO.getNome());
		faixaRendaNaoInformadaRule.valida(malaDiretaTO.getFaixaRendaInicial(), malaDiretaTO.getFaixaRendaFinal());
		
		MalaDireta malaDireta = new MalaDireta();
		malaDireta.setNome(malaDiretaTO.getNome());
		malaDireta.setFaixaRendaInicial(malaDiretaTO.getFaixaRendaInicial());
		malaDireta.setFaixaRendaFinal(malaDiretaTO.getFaixaRendaFinal());
		malaDiretaDAO.insert(malaDireta);
		
		return new MalaDiretaTO(malaDireta.getId(), malaDireta.getNome(), 
							malaDireta.getFaixaRendaInicial(), malaDireta.getFaixaRendaFinal());
	}
}
