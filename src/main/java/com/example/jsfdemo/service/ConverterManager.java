package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.ConverterBean;

@ApplicationScoped
public class ConverterManager {
	private List<ConverterBean> db = new ArrayList<ConverterBean>();

	public void addPerson(ConverterBean maskotka) {
		ConverterBean newMaskotka = new ConverterBean(null);
		
		
		
		newMaskotka.setImie(maskotka.getImie());
		newMaskotka.setRodzaj(maskotka.getRodzaj());
		newMaskotka.setMaterial(maskotka.getMaterial());
		newMaskotka.setZdjecie(maskotka.getZdjecie());
		newMaskotka.setDateOfBirth(maskotka.getDateOfBirth());
		newMaskotka.setWeight(maskotka.getWeight());
		newMaskotka.setPin(maskotka.getPin());
		newMaskotka.setLogin(maskotka.getLogin());
		newMaskotka.setHaslo(maskotka.getHaslo());

		db.add(newMaskotka);
	}

	
	public void deletePerson(ConverterBean maskotka) {
		ConverterBean personToRemove = null;
		for (ConverterBean p : db) {
			if (maskotka.getMaterial().equals(p.getMaterial())) {
				personToRemove = p;
				break;
			}
		}
		if (personToRemove != null)
			db.remove(personToRemove);
	}

	public List<ConverterBean> getAllMaskotka() {
		return db;
	}
}
