package com.tacoshop.demo.repository;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tacoshop.demo.models.TacoOrder;
import com.tacoshop.demo.models.User;

public interface OrderRepository extends JpaRepository<TacoOrder, Long>{

    List<TacoOrder> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);

}
