package LowLevelDesign.coffeevendingmachine;

import java.util.*;

public class CoffeeMachine {

    private static final CoffeeMachine instance = new CoffeeMachine();
    private final List<Coffee> coffeeMenu;
    private final Map<String, Ingredient> ingredients;

    private CoffeeMachine(){
        coffeeMenu = new ArrayList<>();
        ingredients = new HashMap<>();

        //initialize coffee menu and ingredients
        initializeIngredients();
        initializeCoffeeMenu();
    }

    public static CoffeeMachine getInstance(){
        return instance;
    }

    private void initializeCoffeeMenu(){
        Map<Ingredient, Integer> espresspRecipe = new HashMap<>();
        espresspRecipe.put(ingredients.get("Coffee"), 1);
        espresspRecipe.put(ingredients.get("Water"), 1);
        coffeeMenu.add(new Coffee("Espresso", 2.5, espresspRecipe));

        Map<Ingredient, Integer> cappuccinoRecipe = new HashMap<>();
        cappuccinoRecipe.put(ingredients.get("Coffee"), 1);
        cappuccinoRecipe.put(ingredients.get("Water"), 1);
        cappuccinoRecipe.put(ingredients.get("Milk"), 1);
        coffeeMenu.add(new Coffee("Cappuccino", 3.5, cappuccinoRecipe));

        Map<Ingredient, Integer> latteRecipe = new HashMap<>();
        latteRecipe.put(ingredients.get("Coffee"), 1);
        latteRecipe.put(ingredients.get("Water"), 1);
        latteRecipe.put(ingredients.get("Milk"), 2);
        coffeeMenu.add(new Coffee("Latte", 4.0, latteRecipe));
    }

    private void initializeIngredients(){
        ingredients.put("Coffee", new Ingredient("Coffee", 10));
        ingredients.put("Water", new Ingredient("Water", 10));
        ingredients.put("Milk", new Ingredient("Milk", 10));
    }
}
