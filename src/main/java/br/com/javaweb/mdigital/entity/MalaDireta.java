package br.com.javaweb.mdigital.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="dbo", name="MALA_DIRETA")
public class MalaDireta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idMalaDireta")
	private Integer id;
	
	@Column(name = "nmMalaDireta", nullable = false, length = 200)
	private String nome;
	
	@Column(name = "vlFaixaRendaInicial", nullable = false, precision = 15, scale = 2)
	private BigDecimal faixaRendaInicial;
	
	@Column(name = "vlFaixaRendaFinal", nullable = false, precision = 15, scale = 2)
	private BigDecimal faixaRendaFinal;
	
	public MalaDireta() {
	}

	public MalaDireta(Integer id, String nome, BigDecimal faixaRendaInicial, BigDecimal faixaRendaFinal) {
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
}