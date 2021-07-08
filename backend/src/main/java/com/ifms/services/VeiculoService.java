package com.ifms.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import com.ifms.repositories.VeiculoRepository;
import com.ifms.services.exceptions.DataBaseException;
import com.ifms.dto.VeiculoDTO;
import com.ifms.entities.Veiculo;
import com.ifms.services.exceptions.ResourceNotFoundException;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository repository;

	@Transactional(readOnly = true)
	public List<VeiculoDTO> findAll() {
		List<Veiculo> list = repository.findAll();
		return list.stream().map(Veiculo -> new VeiculoDTO(Veiculo)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public VeiculoDTO findById(Long id) {
		Optional<Veiculo> obj = repository.findById(id);
		Veiculo Veiculo = obj.orElseThrow(() -> new ResourceNotFoundException("Não foi encontrado o veiculo."));
		return new VeiculoDTO(Veiculo);
	}

	@Transactional
	public VeiculoDTO insert(VeiculoDTO dto) {
		Veiculo entity = new Veiculo();
		entity.setAno(dto.getAno());;
		entity.setPlaca(dto.getPlaca());
		entity.setRenavan(dto.getRenavan());
		entity.setPatrimonio(dto.getPatrimonio());
		entity.setChassi(dto.getChassi());
		entity.setVersao(dto.getVersao());
		entity.setCapacidadeTanque(dto.getCapacidadeTanque());
		entity.setTipoCombustivel(dto.getTipoCombustivel());
		entity.setTipo(dto.getTipo());
		entity = repository.save(entity);
		return new VeiculoDTO(entity);
	}

	@Transactional
	public VeiculoDTO update(Long id, VeiculoDTO dto) {
		try {
			Veiculo entity = repository.getOne(id);
			entity.setAno(dto.getAno());;
			entity.setPlaca(dto.getPlaca());
			entity.setRenavan(dto.getRenavan());
			entity.setPatrimonio(dto.getPatrimonio());
			entity.setChassi(dto.getChassi());
			entity.setVersao(dto.getVersao());
			entity.setCapacidadeTanque(dto.getCapacidadeTanque());
			entity.setTipoCombustivel(dto.getTipoCombustivel());
			entity.setTipo(dto.getTipo());
			entity = repository.save(entity);
			return new VeiculoDTO(entity);
			} catch (EntityNotFoundException e) {
				throw new ResourceNotFoundException("Não foi encontrado o veiculo.");
				}
			}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Não foi encontrado o veiculo.");
		}catch (DataIntegrityViolationException e) {
			throw new DataBaseException("Não é possível deletar o veiculo.");
		}
	}
}