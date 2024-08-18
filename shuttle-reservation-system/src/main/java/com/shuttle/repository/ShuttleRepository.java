package com.shuttle.repository;

import com.shuttle.model.Shuttle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShuttleRepository extends JpaRepository<Shuttle, Long> {
}
