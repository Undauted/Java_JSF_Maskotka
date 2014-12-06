package com.example.jsfdemo.web;


import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;



@ManagedBean(name = "logoutBean")
public class LogoutBean {

	public String logout(){
	      FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	      return "login.jsf";
	   }
}
