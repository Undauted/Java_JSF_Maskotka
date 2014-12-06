package com.example.jsfdemo.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
@ManagedBean(name = "message", eager = true)
@RequestScoped
public class Message {
	
	private String message = "WITAM NA STRONIE O MASKOTKACH!";
	
	public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}