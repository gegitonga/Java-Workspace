package com.tacoshop.demo.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tacoshop.demo.models.Taco;
import com.tacoshop.demo.repository.TacoRepository;

@Service
public class TacoService {
    @Autowired
    private TacoRepository tacoRepository;

    public Page<Taco> findAll(Pageable pageable){
        return tacoRepository.findAll(pageable);
    }

    public Optional<Taco> findById(Long id){
        return tacoRepository.findById(id);
    }

    public Taco saveTaco(Taco taco){
        return tacoRepository.save(taco);
    }


}
