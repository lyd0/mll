package com.edmar.mll.repository;

import com.edmar.mll.entities.dto.Well;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WellRepository extends JpaRepository<Well,Integer> {
}
