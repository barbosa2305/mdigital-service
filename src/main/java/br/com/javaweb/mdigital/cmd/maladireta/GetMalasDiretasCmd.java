package br.com.javaweb.mdigital.cmd.maladireta;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.dao.MalaDiretaDAO;
import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Component
public class GetMalasDiretasCmd {

	@Autowired
	private MalaDiretaDAO malaDiretaDAO;

	public List<MalaDiretaTO> get() {
		List<MalaDiretaTO> malasDiretasTO = new ArrayList<MalaDiretaTO>();
		List<MalaDireta> malasDiretas = malaDiretaDAO.listAll();
		for (MalaDireta malaDireta : malasDiretas) {
			malasDiretasTO.add(new MalaDiretaTO(malaDireta.getId(), malaDireta.getNome(), 
									malaDireta.getFaixaRendaInicial(), malaDireta.getFaixaRendaFinal()));
		}

		return malasDiretasTO;
	}
}
