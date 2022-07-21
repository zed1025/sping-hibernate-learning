package com.amitkr25.LombokDemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
	@Size(min=5, max=14, message="Name $'{validatedValue}' size must be between {min} and {max}")
	private String name;
	@Max(20)
	private String address;
//	public void setAddress(String string) {
//		// TODO Auto-generated method stub
//		this.address = string;
//	}
}
