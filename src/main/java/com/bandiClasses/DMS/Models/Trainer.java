package com.bandiClasses.DMS.Models;

/**
 * @author S565489 Pallavi Pokuri
 */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Trainer {
	
	@Id
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	public int getTrainerId() {
		return trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	
	
}
