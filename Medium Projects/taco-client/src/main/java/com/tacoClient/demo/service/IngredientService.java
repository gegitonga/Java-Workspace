package com.tacoClient.demo.service;

import com.tacoClient.demo.models.Ingredient;

public interface IngredientService {
    Iterable<Ingredient> findAll();
    Ingredient addIngredient(Ingredient ingredient);
}
