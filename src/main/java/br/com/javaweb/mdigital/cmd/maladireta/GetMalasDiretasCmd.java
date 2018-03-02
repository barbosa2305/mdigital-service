package br.com.javaweb.mdigital.cmd.maladireta;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.builder.MalaDiretaTOBuilder;
import br.com.javaweb.mdigital.dao.MalaDiretaDAO;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Component
public class GetMalasDiretasCmd {

	@Autowired
	private MalaDiretaDAO malaDiretaDAO;

	@Autowired
	private MalaDiretaTOBuilder malaDiretaTOBuilder;

	public List<MalaDiretaTO> get() {
		return malaDiretaTOBuilder.build(malaDiretaDAO.listAll());
	}
}
