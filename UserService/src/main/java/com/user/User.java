package com.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	Integer userId;
	String userName;
	
	Review review;
	Product product;
	
	
	public User(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	

}
