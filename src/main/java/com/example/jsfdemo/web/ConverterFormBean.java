package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.UIInput;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import com.example.jsfdemo.domain.ConverterBean;
import com.example.jsfdemo.service.ConverterManager;

@SessionScoped
@ManagedBean(name = "personBean", eager = true)
public class ConverterFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private ConverterBean maskotka = new ConverterBean(null);

	private ListDataModel<ConverterBean> maskotki = new ListDataModel<ConverterBean>();

	@Inject
	private ConverterManager pm;

	public ConverterBean getMaskotka() {
		return maskotka;
	}

	public void setMaskotka(ConverterBean maskotka) {
		this.maskotka = maskotka;
	}

	public ListDataModel<ConverterBean> getAllMaskotki() {
		maskotki.setWrappedData(pm.getAllMaskotka());
		return maskotki;
	}

	
	public String addPerson() {
		pm.addPerson(maskotka);
		return "wyswie";
		
	}
	
	

	public String deletePerson() {
		ConverterBean personToDelete = maskotki.getRowData();
		pm.deletePerson(personToDelete);
		return null;
	}

	public void uniqueImie(FacesContext context, UIComponent component,
			Object value) {

		String imie = (String) value;

		for (ConverterBean person : pm.getAllMaskotka()) {
			if (person.getImie().equalsIgnoreCase(imie)) {
				FacesMessage message = new FacesMessage(
						"Maskotka o tym imieniu istnieje juz na liście");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
		}
	}
	
	
	
	
	
	
	
	public void validatePinDob(ComponentSystemEvent event) {

		UIForm form = (UIForm) event.getComponent();
		UIInput pin = (UIInput) form.findComponent("pin");
		UIInput dob = (UIInput) form.findComponent("dob");

		if (pin.getValue() != null && dob.getValue() != null
				&& pin.getValue().toString().length() >= 2) {
			String twoDigitsOfPin = pin.getValue().toString().substring(0, 2);
			Calendar cal = Calendar.getInstance();
			cal.setTime(((Date) dob.getValue()));

			String lastDigitsOfDob = ((Integer) cal.get(Calendar.YEAR))
					.toString().substring(2);

			if (!twoDigitsOfPin.equals(lastDigitsOfDob)) {
				FacesContext context = FacesContext.getCurrentInstance();
				context.addMessage(form.getClientId(), new FacesMessage(
						"PIN doesn't match date of birth"));
				context.renderResponse();
			}
		}
	}
}
