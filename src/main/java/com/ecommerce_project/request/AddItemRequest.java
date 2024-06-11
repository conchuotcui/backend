package com.ecommerce_project.request;

import lombok.Data;

@Data
public class AddItemRequest {
	private Long productId;
	private String size;
	private int quantity;
	private Integer price;
	private String color;
	
}
