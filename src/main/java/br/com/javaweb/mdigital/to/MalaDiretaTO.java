package br.com.javaweb.mdigital.to;

import java.math.BigDecimal;

public class MalaDiretaTO {
	
	private Integer id;
	private String nome;
	private BigDecimal faixaRendaInicial;
	private BigDecimal faixaRendaFinal;
	
	public MalaDiretaTO() {
	}

	public MalaDiretaTO(Integer id, String nome, BigDecimal faixaRendaInicial, BigDecimal faixaRendaFinal) {
		this.id = id;
		this.nome = nome;
		this.faixaRendaInicial = faixaRendaInicial;
		this.faixaRendaFinal = faixaRendaFinal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getFaixaRendaInicial() {
		return faixaRendaInicial;
	}

	public void setFaixaRendaInicial(BigDecimal faixaRendaInicial) {
		this.faixaRendaInicial = faixaRendaInicial;
	}

	public BigDecimal getFaixaRendaFinal() {
		return faixaRendaFinal;
	}

	public void setFaixaRendaFinal(BigDecimal faixaRendaFinal) {
		this.faixaRendaFinal = faixaRendaFinal;
	}

	@Override
	public String toString() {
		return "MalaDiretaTO [id=" + id + ", nome=" + nome + ", faixaRendaInicial=" + faixaRendaInicial + ", faixaRendaFinal=" + faixaRendaFinal + "]";
	}	
}