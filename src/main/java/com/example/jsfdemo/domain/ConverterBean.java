package com.example.jsfdemo.domain;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@ManagedBean(name = "converterBean", eager = true)

@RequestScoped
public class ConverterBean {
	
	private String zdjecie=""; 
	
	public ConverterBean(String zdjecie) {
		 	this.zdjecie=zdjecie;
	    }
	 
	private String imie = "";
	private String rodzaj = "";
	private String material = "";
	
	private String login = "";
	private String haslo = "";
	private int pin;
	private Date dateOfBirth = new Date();
	private double weight;
	
	@Pattern(regexp = "[a-zA-Z]{4,}" , message="Musza być więcej niż cztery litery")
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
	
	@Past(message="Data musi byc z przeszłości :P")
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
	
	@Size(min=4 , message="Login musi sie składać z minimum 4 liter")
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	@Size(min=4 , message="Hasło musi sie składać z minimum 4 liter")
	public String getHaslo() {
		return haslo;
	}
	public void setHaslo(String haslo) {
		this.haslo = haslo;
	}
	
	 public String akceptuj() {

	  

	        return "dodanie.jsf";

	    }
	
}
