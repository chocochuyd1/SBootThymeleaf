package com.softtek.robotics.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.robotics.entity.Products;
import com.softtek.robotics.repository.ProductRepository;
import com.sun.xml.bind.v2.model.core.ID;

@Service
public class ProductService {
	private ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public Products createProduct(Products product) {
		return productRepository.save(product);
	}
	
	public List<Products> getAllProducts () {
		List<Products> list = new ArrayList<Products>();
		productRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	public Products getProductById(int id) {
		Products product = productRepository.findById(id).get();
		return product;
		}
	

}
