package com.ifms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifms.entities.Abastecimento;

@Repository
public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long> {

}
