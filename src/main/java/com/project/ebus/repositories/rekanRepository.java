package com.project.ebus.repositories;

import com.project.ebus.models.Rekan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rekanRepository extends JpaRepository<Rekan, Long> {

}
