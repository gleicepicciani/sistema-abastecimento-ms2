package com.ifms.dto;

import java.io.Serializable;
import java.time.Instant;

import com.ifms.entities.AutoPosto;
import com.ifms.entities.Abastecimento;
import com.ifms.entities.Veiculo;
import com.ifms.entities.enums.Combustivel;

public class AbastecimentoDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	//o que vamos transferir pela internet
	private Long id;
	private String cpfMotorista;
	private Instant dataDoAbastecimento;
	private Long quilometragem;
	private Combustivel combustivel;
	private Integer quantidadeEmLitros;
	private Double valorPorLitro;
	private AutoPosto autoposto;
	private Veiculo veiculo;	
	
	public AbastecimentoDTO() {	}

	public AbastecimentoDTO(Long id, String cpfMotorista, Instant dataDoAbastecimento, Long quilometragem,
			Combustivel combustivel, Integer quantidadeEmLitros, Double valorPorLitro, AutoPosto autoposto,
			Veiculo veiculo) {
		this.id = id;
		this.cpfMotorista = cpfMotorista;
		this.dataDoAbastecimento = dataDoAbastecimento;
		this.quilometragem = quilometragem;
		this.combustivel = combustivel;
		this.quantidadeEmLitros = quantidadeEmLitros;
		this.valorPorLitro = valorPorLitro;
		this.autoposto = autoposto;
		this.veiculo = veiculo;
	}
	
	
	
	public AbastecimentoDTO(Abastecimento entity) {
		this.id = entity.getId();
		this.cpfMotorista = entity.getCpfMotorista();
		this.dataDoAbastecimento = entity.getDataDoAbastecimento();
		this.quilometragem = entity.getQuilometragem(); 
		this.combustivel = entity.getCombustivel();
		this.quantidadeEmLitros = entity.getQuantidadeEmLitros();
		this.valorPorLitro = entity.getValorPorLitro();
		this.autoposto = entity.getAutoPosto();
		this.veiculo = entity.getVeiculo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpfMotorista() {
		return cpfMotorista;
	}

	public void setCpfMotorista(String cpfMotorista) {
		this.cpfMotorista = cpfMotorista;
	}

	public Instant getDataDoAbastecimento() {
		return dataDoAbastecimento;
	}

	public void setDataDoAbastecimento(Instant dataDoAbastecimento) {
		this.dataDoAbastecimento = dataDoAbastecimento;
	}

	public Long getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Long quilometragem) {
		this.quilometragem = quilometragem;
	}

	public Combustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getQuantidadeEmLitros() {
		return quantidadeEmLitros;
	}

	public void setQuantidadeEmLitros(Integer quantidadeEmLitros) {
		this.quantidadeEmLitros = quantidadeEmLitros;
	}

	public Double getValorPorLitro() {
		return valorPorLitro;
	}

	public void setValorPorLitro(Double valorPorLitro) {
		this.valorPorLitro = valorPorLitro;
	}

	public AutoPosto getAutoposto() {
		return autoposto;
	}

	public void setAutoposto(AutoPosto autoposto) {
		this.autoposto = autoposto;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
}
