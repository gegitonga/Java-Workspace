package com.tacoshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tacoshop.demo.models.TacoOrder;

public interface OrderRepository extends JpaRepository<TacoOrder, Long>{

}
