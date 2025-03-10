package com.tacoshop.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tacoshop.demo.models.Ingredient;
import com.tacoshop.demo.repository.IngredientRepository;

@Service
public class IngredientService {
	
	@Autowired
	private IngredientRepository ingredientRepository;
	
	public List<Ingredient> findAll(){
		return ingredientRepository.findAll();
	}

	public Ingredient save(Ingredient ingredient){
		return ingredientRepository.save(ingredient);
	}

	public void delete(String id){
		ingredientRepository.deleteById(id);
	}
}
