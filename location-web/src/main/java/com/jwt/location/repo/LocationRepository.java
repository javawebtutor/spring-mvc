package com.jwt.location.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jwt.location.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
