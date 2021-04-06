package com.wolken.wolkenapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="fruit_table")
@Getter
@Setter
public class FruitDTO {
	
	@Id
	@Column(name="fruit_id")
	private int fruitId;
	@Column(name="fruit_name")
	private String fruitName;
	


	
}
