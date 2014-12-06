package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;


import com.example.jsfdemo.domain.Reje;

@ApplicationScoped
public class Rejestr {
	private List<Reje> db = new ArrayList<Reje>();

	public void addPerson(Reje rejestracja) {
		Reje newMaskotka = new Reje();
		
		
		
		newMaskotka.setLogin(rejestracja.getLogin());
		newMaskotka.setHaslo(rejestracja.getHaslo());

		db.add(newMaskotka);
	}

	public List<Reje> getAllRejestr() {
		return db;
	}
	
	
}
