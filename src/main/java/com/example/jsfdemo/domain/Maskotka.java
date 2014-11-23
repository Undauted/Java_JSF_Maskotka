package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Maskotka {
	
	private String imie = "";
	private String rodzaj = "";
	private String material = "";
	private String zdjecie="";
	private int pin;
	private Date dateOfBirth = new Date();
	private double weight;
	
	@Pattern(regexp = "[a-zA-Z]{4,}")
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	
	
	public String getRodzaj() {
		return rodzaj;
	}
	public void setRodzaj(String rodzaj) {
		this.rodzaj = rodzaj;
	}
	
	@Past
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getZdjecie() {
		return zdjecie;
	}
	public void setZdjecie(String zdjecie) {
		this.zdjecie = zdjecie;
	}
	
}
