package com.edutecno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.model.Region;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {

}
