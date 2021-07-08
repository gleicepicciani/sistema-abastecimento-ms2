package com.ifms.resources;

import java.net.URI;
import java.util.List;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ifms.dto.LotacaoDTO;
import com.ifms.services.LotacaoService;

@RestController
@RequestMapping(value = "/lotacoes")
public class LotacaoResource {
	
	@Autowired
	private LotacaoService service;
	
	@GetMapping
	public ResponseEntity<List<LotacaoDTO>> findAll(){
		List<LotacaoDTO> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<LotacaoDTO> findById(@PathVariable Long id){
	LotacaoDTO dto = service.findById(id);
	return ResponseEntity.ok().body(dto);
	}
	
	@PostMapping
	public ResponseEntity<LotacaoDTO> insert(@RequestBody LotacaoDTO dto){
	dto = service.insert(dto);
	 URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
	return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<LotacaoDTO> update(@PathVariable Long id, @RequestBody LotacaoDTO dto){
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}
	
	//deletar
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<LotacaoDTO> delete(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
