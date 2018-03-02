package br.com.javaweb.mdigital.builder;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.com.javaweb.mdigital.entity.MalaDireta;
import br.com.javaweb.mdigital.to.MalaDiretaTO;

@Component
public class MalaDiretaTOBuilder {

	public MalaDiretaTO build(MalaDireta malaDireta) {
		// @formatter:off
		return new MalaDiretaTO(malaDireta.getId(), malaDireta.getNome(), 
		   		                malaDireta.getFaixaRendaInicial(), malaDireta.getFaixaRendaFinal());
		// @formatter:on
	}

	public List<MalaDiretaTO> build(List<MalaDireta> malasDiretas) {
		List<MalaDiretaTO> malasDiretasTO = new ArrayList<MalaDiretaTO>();

		// @formatter:off
		malasDiretas.stream()
					.forEach(malaDireta -> malasDiretasTO.add(build(malaDireta)));
		// @formatter:on

		return malasDiretasTO;
	}
}
