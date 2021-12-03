package com.project.ebus.repositories;

import com.project.ebus.models.Developers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// brata
@Repository
public interface developerRepository extends JpaRepository<Developers, Long> {

}
