package com.softtek.robotics;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softtek.robotics.entity.Products;
import com.softtek.robotics.service.ProductService;

@SpringBootApplication
public class RoboticsApplication implements CommandLineRunner{
	
	@Autowired
	ProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(RoboticsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int[] randIArr = new int[7];
		float[] randFArr = new float[7];
		
		for (int i = 0; i < randIArr.length; i++) {
			randIArr[i] = rand.nextInt(20);
		}
		
		for (int j = 0; j < randFArr.length; j++) {
			randFArr[j] = rand.nextFloat() * (100 - 1);
		}
		
//		float randFArr[] = 1 + rand.nextFloat() * (100 - 1);
//		float randFArr[] = rand.nextFloat();
		
		Products Robot1 = new Products();
		Robot1.setProductName("Land Robot");
		Robot1.setDescription("Robot that travels in land");
		Robot1.setPrice(randFArr[1]);
		Robot1.setStock(randIArr[1]);
		
		Products Robot2 = new Products();
		Robot2.setProductName("Whater Robot");
		Robot2.setDescription("Robot that swims");
		Robot2.setPrice(randFArr[2]);
		Robot2.setStock(randIArr[2]);
		
		Products Robot3 = new Products();
		Robot3.setProductName("Sky Robot");
		Robot3.setDescription("Robot that flys");
		Robot3.setPrice(randFArr[3]);
		Robot3.setStock(randIArr[3]);
		
		Products Robot4 = new Products();
		Robot4.setProductName("Submarine Robot");
		Robot4.setDescription("Robot that travels under whater");
		Robot4.setPrice(randFArr[4]);
		Robot4.setStock(randIArr[4]);
		
		Products Robot5 = new Products();
		Robot5.setProductName("Mole Robot");
		Robot5.setDescription("Robot that travels through land");
		Robot5.setPrice(randFArr[5]);
		Robot5.setStock(randIArr[5]);
		
		Products Robot6 = new Products();
		Robot6.setProductName("Space Robot");
		Robot6.setDescription("Robot that orbits the earth");
		Robot6.setPrice(randFArr[6]);
		Robot6.setStock(randIArr[6]);
		
		Products Robot7 = new Products();
		Robot7.setProductName("Time Robot (Terminator)");
		Robot7.setDescription("Robot that travels through time");
		Robot7.setPrice(randFArr[0]);
		Robot7.setStock(randIArr[0]);
		
		productService.createProduct(Robot1);
		productService.createProduct(Robot2);
		productService.createProduct(Robot3);
		productService.createProduct(Robot4);
		productService.createProduct(Robot5);
		productService.createProduct(Robot6);
		productService.createProduct(Robot7);
	}

}
