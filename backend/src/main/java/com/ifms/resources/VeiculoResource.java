package com.ifms.resources;

import java.net.URI;
import java.util.List;


import com.ifms.dto.VeiculoDTO;
import com.ifms.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping(value= "/veiculos")
public class VeiculoResource {
	
	@Autowired
	private VeiculoService service;
	
	@GetMapping
	public ResponseEntity<List<VeiculoDTO>> findAll(){
		List<VeiculoDTO> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> findById(@PathVariable Long id){
	VeiculoDTO dto = service.findById(id);
	return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<VeiculoDTO> insert(@RequestBody VeiculoDTO dto){
	dto = service.insert(dto);
	 URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
	return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> update(@PathVariable Long id, @RequestBody VeiculoDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<VeiculoDTO> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}