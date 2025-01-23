package com.ordersystem.inventoryservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ordersystem.inventoryservice.models.InventoryItem;

public interface InventoryRepository extends MongoRepository<InventoryItem, String> {

}
