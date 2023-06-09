package com.example.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/*Q1-1*/
@Entity
@Table(name = "ANIMALS")
public class Animal {
	@Id
	@SequenceGenerator(name = "ANIMAL_ID_GENERATOR", sequenceName = "ANIMAL_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ANIMAL_ID_GENERATOR")
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}