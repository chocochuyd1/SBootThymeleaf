package com.softtek.robotics.repository;

import org.springframework.data.repository.CrudRepository;

import com.softtek.robotics.entity.Products;
import com.sun.xml.bind.v2.model.core.ID;

public interface ProductRepository extends CrudRepository<Products, Integer> {

}
