package com.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
	
	
	@GetMapping("/{id}")
	public Review getReview(@PathVariable Integer id, String review) {
		
		Review review1 = new Review(id,"Awesome Product"); 
		return review1;
		
		
	}

}
