package com.ifms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifms.entities.AutoPosto;

@Repository
public interface AutoPostoRepository extends JpaRepository<AutoPosto, Long> {

}
