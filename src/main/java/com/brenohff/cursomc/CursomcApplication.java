package com.brenohff.cursomc;

import com.brenohff.cursomc.entities.CategoryEntity;
import com.brenohff.cursomc.entities.ProductEntity;
import com.brenohff.cursomc.repositories.CategoryRepository;
import com.brenohff.cursomc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CategoryEntity categoryEntity1 = new CategoryEntity(null, "Informática");
		CategoryEntity categoryEntity2 = new CategoryEntity(null, "Escritório");

		ProductEntity p1 = new ProductEntity(null, "Computador", 2000.0);
		ProductEntity p2 = new ProductEntity(null, "Impressora", 800.0);
		ProductEntity p3 = new ProductEntity(null, "Mouse", 80.0);

		categoryEntity1.getProductList().addAll(Arrays.asList(p1, p2, p3));
		categoryEntity2.getProductList().addAll(Arrays.asList(p2));

		p1.getCategoryList().addAll(Arrays.asList(categoryEntity1));
		p2.getCategoryList().addAll(Arrays.asList(categoryEntity1, categoryEntity2));
		p3.getCategoryList().addAll(Arrays.asList(categoryEntity1));

		categoryRepository.saveAll(Arrays.asList(categoryEntity1, categoryEntity2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
}
