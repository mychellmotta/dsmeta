package com.mychellmotta.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mychellmotta.dsmeta.entities.Sale;

public interface SalesRepository extends JpaRepository<Sale, Long> {

}