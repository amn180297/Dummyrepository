package com.cg.spring.boot.jpa.springbootdatajpa.product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("/products")
	public List<Product> getAllproducts() {
		return productService.getAllProduct();
	}

	@RequestMapping("/products/{id}")
	public Optional<Product> getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}

	@RequestMapping(method = RequestMethod.POST, value="/product")
	public void addProduct(@RequestBody Product p) {
		productService.addProduct(p);
	}

}
