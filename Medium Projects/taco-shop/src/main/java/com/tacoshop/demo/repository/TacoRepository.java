package com.tacoshop.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tacoshop.demo.models.Taco;

public interface TacoRepository extends JpaRepository<Taco, Long> {
}
