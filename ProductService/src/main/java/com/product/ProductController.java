package com.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable Integer id, String pname) {
		
		Product product = new Product(id,"Lenovo Laptop");
		
		return product;
		
	}

}
