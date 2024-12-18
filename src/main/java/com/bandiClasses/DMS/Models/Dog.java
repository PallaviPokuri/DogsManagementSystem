package com.bandiClasses.DMS.Models;

/**
 * @author S565489 Pallavi Pokuri
 */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Dog {
	@Id
	private int id;
	private String name;
	private String breed;
	@ManyToOne
	private Trainer trainer;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", trainer=" + trainer + "]";
	}
	
	
	
	
}
