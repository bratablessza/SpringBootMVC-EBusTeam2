package com.project.ebus.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// brata

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "perusahaan")
public class Perusahaan {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;
    String nama;
    String deskripsi;
}
