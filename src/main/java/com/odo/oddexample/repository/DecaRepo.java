package com.odo.oddexample.repository;

import com.odo.oddexample.model.Decagon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DecaRepo extends JpaRepository<Decagon, Long> {
}
