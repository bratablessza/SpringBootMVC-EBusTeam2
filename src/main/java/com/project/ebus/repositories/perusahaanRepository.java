package com.project.ebus.repositories;

import com.project.ebus.models.Perusahaan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface perusahaanRepository extends JpaRepository<Perusahaan, Long> {

}
