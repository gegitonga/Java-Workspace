package com.tacoClient.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tacoClient.demo.models.Ingredient;


public interface IngredientRepository extends JpaRepository<Ingredient, String>{
  
}
