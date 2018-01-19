package br.com.javaweb.mdigital.cmd.maladireta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.MalaDiretaDAO;
import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.rule.maladireta.MalaDiretaNaoEncontradaRule;

@Component
public class ExcluirMalaDiretaCmd {

	@Autowired
	private MalaDiretaDAO malaDiretaDAO;

	@Autowired
	private MalaDiretaNaoEncontradaRule malaDiretaNaoEncontradaRule;

	public void excluir(Integer idMalaDireta) {
		MalaDireta malaDireta = malaDiretaDAO.getPorCodigo(idMalaDireta);

		malaDiretaNaoEncontradaRule.valida(malaDireta);

		malaDiretaDAO.delete(malaDireta);
	}
}
