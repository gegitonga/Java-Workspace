package com.tacoshop.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tacoshop.demo.models.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, String>{

}
