package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Maskotka;

@ApplicationScoped
public class MaskotkaManager {
	private List<Maskotka> db = new ArrayList<Maskotka>();

	public void addPerson(Maskotka maskotka) {
		Maskotka newMaskotka = new Maskotka();
		
		
		
		newMaskotka.setImie(maskotka.getImie());
		newMaskotka.setRodzaj(maskotka.getRodzaj());
		newMaskotka.setMaterial(maskotka.getMaterial());
		newMaskotka.setZdjecie(maskotka.getZdjecie());
		newMaskotka.setDateOfBirth(maskotka.getDateOfBirth());
		newMaskotka.setWeight(maskotka.getWeight());
		newMaskotka.setPin(maskotka.getPin());

		db.add(newMaskotka);
	}

	
	public void deletePerson(Maskotka maskotka) {
		Maskotka personToRemove = null;
		for (Maskotka p : db) {
			if (maskotka.getMaterial().equals(p.getMaterial())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<Maskotka> getAllMaskotka() {
		return db;
	}
}
