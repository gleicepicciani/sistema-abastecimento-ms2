package com.ifms.dto;

import java.io.Serializable;

import com.ifms.entities.enums.Combustivel;
import com.ifms.entities.Tipo;
import com.ifms.entities.Veiculo;


public class VeiculoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer ano;
	private String placa;
	private String renavan;
	private String patrimonio;
	private String chassi;
	private String versao;
	private Integer capacidadeTanque;	
	private Combustivel tipoCombustivel;
	private Tipo tipo;
	
	public VeiculoDTO() {}

	public VeiculoDTO(Long id, Integer ano, String placa, String renavan, String patrimonio, String chassi,
			String versao, Integer capacidadeTanque, Combustivel tipoCombustivel, Tipo tipo) {
		super();
		this.id = id;
		this.ano = ano;
		this.placa = placa;
		this.renavan = renavan;
		this.patrimonio = patrimonio;
		this.chassi = chassi;
		this.versao = versao;
		this.capacidadeTanque = capacidadeTanque;
		this.tipoCombustivel = tipoCombustivel;
		this.tipo = tipo;
	}
	
	public VeiculoDTO(Veiculo entity) {
		this.id = entity.getId();
		this.ano = entity.getAno();
		this.placa = entity.getPlaca();
		this.renavan = entity.getRenavan();
		this.patrimonio = entity.getPatrimonio();
		this.chassi = entity.getChassi();
		this.versao = entity.getVersao();
		this.capacidadeTanque = entity.getCapacidadeTanque();
		this.tipoCombustivel = entity.getTipoCombustivel();
		this.tipo = entity.getTipo();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getRenavan() {
		return renavan;
	}


	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}


	public String getPatrimonio() {
		return patrimonio;
	}


	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}


	public String getChassi() {
		return chassi;
	}


	public void setChassi(String chassi) {
		this.chassi = chassi;
	}


	public String getVersao() {
		return versao;
	}


	public void setVersao(String versao) {
		this.versao = versao;
	}


	public Integer getCapacidadeTanque() {
		return capacidadeTanque;
	}


	public void setCapacidadeTanque(Integer capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}


	public Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}


	public void setTipoCombustivel(Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
}
