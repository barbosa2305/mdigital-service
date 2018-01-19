package br.com.javaweb.mdigital.cmd.maladireta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.MalaDiretaDAO;
import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.rule.maladireta.FaixaRendaNaoInformadaRule;
import br.com.javaweb.mdigital.rule.maladireta.MalaDiretaNaoEncontradaRule;
import br.com.javaweb.mdigital.rule.maladireta.NomeMalaDiretaNaoInformadoRule;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Component
public class AlterarMalaDiretaCmd {

	@Autowired
	private MalaDiretaDAO malaDiretaDAO;

	@Autowired
	private MalaDiretaNaoEncontradaRule malaDiretaNaoEncontradaRule;

	@Autowired
	private NomeMalaDiretaNaoInformadoRule nomeMalaDiretaNaoInformadoRule;

	@Autowired
	private FaixaRendaNaoInformadaRule faixaRendaNaoInformadaRule;

	public MalaDiretaTO alterar(Integer idMalaDireta, MalaDiretaTO malaDiretaTO) {
		MalaDireta malaDireta = malaDiretaDAO.getPorCodigo(idMalaDireta);

		malaDiretaNaoEncontradaRule.valida(malaDireta);
		nomeMalaDiretaNaoInformadoRule.valida(malaDiretaTO.getNome());
		faixaRendaNaoInformadaRule.valida(malaDiretaTO.getFaixaRendaInicial(), malaDiretaTO.getFaixaRendaFinal());

		malaDireta.setNome(malaDiretaTO.getNome());
		malaDireta.setFaixaRendaInicial(malaDiretaTO.getFaixaRendaInicial());
		malaDireta.setFaixaRendaFinal(malaDiretaTO.getFaixaRendaFinal());
		malaDiretaDAO.update(malaDireta);

		return new MalaDiretaTO(malaDireta.getId(), malaDireta.getNome(), malaDireta.getFaixaRendaInicial(), malaDireta.getFaixaRendaFinal());
	}
}
