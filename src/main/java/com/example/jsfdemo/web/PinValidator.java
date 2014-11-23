package com.example.jsfdemo.web;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("pinValidator")
public class PinValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		
		String imie = (String) value;
		
		if (imie.length() < 4 || imie.length() > 20) {
			FacesMessage message = new FacesMessage();
			message.setDetail("Tekst materiału musi byc w przedziale 4-20");
			message.setSummary("Tekst materiału musi byc w przedziale 4-20");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}
		
	}
}
