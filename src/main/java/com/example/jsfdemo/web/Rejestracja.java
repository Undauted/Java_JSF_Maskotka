package com.example.jsfdemo.web;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;


import com.example.jsfdemo.domain.Reje;
import com.example.jsfdemo.service.Rejestr;

@ManagedBean(name = "rejestracja")
public class Rejestracja {
	
	private Reje rejestracja = new Reje();
	
	@Inject
	private Rejestr pm;

	public Reje getReje() {
		return rejestracja;
	}

	public void setReje(Reje rejestracja) {
		this.rejestracja = rejestracja;
	}
	
	public String addPerson2() {
		pm.addPerson(rejestracja);
		return "login";
		
	}
	
	public void uniqueLogin(FacesContext context, UIComponent component,
			Object value) {

		String login = (String) value;

		for (Reje person : pm.getAllRejestr()) {
			if (person.getLogin().equalsIgnoreCase(login)) {
				FacesMessage message = new FacesMessage(
						"Taki login jest juz zajęty");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
		}
	}

}
