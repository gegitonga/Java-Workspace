package com.tacoshop.demo.controller;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tacoshop.demo.models.Ingredient;
import com.tacoshop.demo.models.Taco;
import com.tacoshop.demo.models.Ingredient.Type;
import com.tacoshop.demo.repository.IngredientRepository;
import com.tacoshop.demo.repository.TacoRepository;
import com.tacoshop.demo.repository.UserRepository;
import com.tacoshop.demo.services.TacoService;

@RestController
@RequestMapping(path="/api/tacos", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class TacoController {
    private TacoService tacoService;

    public TacoController(TacoService tacoService){
        this.tacoService = tacoService;
    }
    
    @GetMapping(params="recent")
    public Iterable<Taco> recentTacos(){
        PageRequest page = PageRequest.of(0, 12, Sort.by("createdAt").descending());
        return tacoService.findAll(page).getContent();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Taco> tacoById(@PathVariable("id") Long id){
       Optional<Taco> optTaco =  tacoService.findById(id);
       if(optTaco.isPresent()){
            return new ResponseEntity<>(optTaco.get(), HttpStatus.OK);
       }
       return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    } 

    @PostMapping(consumes="application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Taco postTaco(@RequestBody Taco taco){
        return tacoService.saveTaco(taco);
    }
    
}
