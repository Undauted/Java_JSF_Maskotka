package com.example.jsfdemo.domain;

import javax.faces.bean.ManagedBean;
import javax.validation.constraints.Size;
@ManagedBean(name = "reje")
public class Reje {
	

	private String login = "";
	private String haslo = "";
	
	
	
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
	
}
