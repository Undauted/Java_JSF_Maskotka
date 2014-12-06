package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import com.example.jsfdemo.domain.Reje;
import com.example.jsfdemo.service.Rejestr;
@ManagedBean
@SessionScoped
public class IndexBean {
	Rejestr pamiec = new Rejestr();
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String login(){
		
		
		
		if(this.username.equals("maskotka") &&
				this.password.equals("maskotka")){
			return "glowna";
		}
		else{
		
			FacesContext.getCurrentInstance().
                                     addMessage(null,
                                 new FacesMessage("Twoj login lub haslo jest błędne :("));
			username = null;
			
			return "login";
		}
		
	}
}