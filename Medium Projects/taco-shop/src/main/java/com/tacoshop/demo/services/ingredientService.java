package com.tacoshop.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacoshop.demo.models.Ingredient;
import com.tacoshop.demo.repository.IngredientRepository;

@Service
public class ingredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public List<Ingredient> findAll(){
		return ingredientRepository.findAll();
	}
}
