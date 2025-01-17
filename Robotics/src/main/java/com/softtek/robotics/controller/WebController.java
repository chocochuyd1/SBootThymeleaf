package com.softtek.robotics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.softtek.robotics.entity.Products;
import com.softtek.robotics.service.ProductService;
import com.sun.xml.bind.v2.model.core.ID;

@Controller
public class WebController {
	
	@Autowired
	public ProductService productService;

	@GetMapping("/home")
	public String goHome(Model model) {
		model.addAttribute("jaTitle","Robotics Home");
		return "index";
	}
	@GetMapping("/about")
	public String abou(Model model) {
		model.addAttribute("jaTitle","About Us");
		return "about";
	}
	@GetMapping("/services")
	public String serv(Model model) {
		model.addAttribute("jaTitle","Our Services");
		return "services";
	}
	@GetMapping("/products")
	public String products(Model model) {
		List<Products> productList = productService.getAllProducts();
		model.addAttribute("productList", productList);
		model.addAttribute("jaTitle","Our Products");
		return "products";
	}
	@GetMapping("/blog-home")
	public String blogHome(Model model) {
		model.addAttribute("jaTitle","Blog");
		return "blog-home";
	}
	@GetMapping("/blog-single")
	public String blogSingle(Model model) {
		model.addAttribute("jaTitle","Blog");
		return "blog-single";
	}
	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("jaTitle","Contact Us");
		return "contact";
	}
	@GetMapping("/elements")
	public String elements(Model model) {
		model.addAttribute("jaTitle","Elements");
		return "elements";
	}
	@GetMapping("/product-details/{id}")
	public String productsDetails(@PathVariable("id") int id, Model model) {
		Products productDetails = productService.getProductById(id);
		model.addAttribute("jaTitle","Details");
		model.addAttribute("product", productDetails);		
		return "product-details";
	}
}
