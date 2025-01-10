package com.tacoshop.demo.controller;

import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tacoshop.demo.models.Taco;
import com.tacoshop.demo.models.TacoOrder;
import com.tacoshop.demo.services.OrderService;
import com.tacoshop.demo.services.TacoService;

@RestController
@RequestMapping(path="/api/tacos", produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class TacoController {
    private TacoService tacoService;
    private OrderService orderService;

    public TacoController(OrderService orderService,TacoService tacoService){
        this.tacoService = tacoService;
        this.orderService = orderService;
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
    

    @PutMapping(path="/{orderId}", consumes="application/json")
    public TacoOrder putOrder(@PathVariable("id") Long orderId, @RequestBody TacoOrder order){
        order.setId(orderId);
        return orderService.saveOrder(order);
    }

    @PatchMapping(path="/{orderId}",consumes="application/json")
    public TacoOrder patchOrder(@PathVariable("orderid") Long orderId, @RequestBody TacoOrder patch){
        TacoOrder order = orderService.findById(orderId).get();
        if(patch.getDeliveryName() != null){
            order.setDeliveryName(patch.getDeliveryName());
        }
        if (patch.getDeliveryStreet() != null) {
            order.setDeliveryStreet(patch.getDeliveryStreet());
          }
          if (patch.getDeliveryCity() != null) {
            order.setDeliveryCity(patch.getDeliveryCity());
          }
          if (patch.getDeliveryState() != null) {
            order.setDeliveryState(patch.getDeliveryState());
          }
          if (patch.getDeliveryZip() != null) {
            order.setDeliveryZip(patch.getDeliveryZip());
          }
          if (patch.getCcNumber() != null) {
            order.setCcNumber(patch.getCcNumber());
          }
          if (patch.getCcExpiration() != null) {
            order.setCcExpiration(patch.getCcExpiration());
          }
          if (patch.getCcCVV() != null) {
            order.setCcCVV(patch.getCcCVV());
          }
          return orderService.saveOrder(order);
    }

    @DeleteMapping("/{orderId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteOrder(@PathVariable("orderId") Long orderId) {
      try {
        orderService.deleteOrder(orderId);
      } catch (EmptyResultDataAccessException e) {}
    }
}
