package Konwerter;

import javax.faces.component.UIComponent;

import javax.faces.context.FacesContext;

import javax.faces.convert.Converter;

import javax.faces.convert.FacesConverter;



@FacesConverter("konwerter")

public class Konwerter implements Converter {

    @Override

    public Object getAsObject(FacesContext context, UIComponent component, String value) {

        System.out.println(" object value " + value);

        return value;

    }

    @Override

    public String getAsString(FacesContext context, UIComponent component, Object value) {

        System.out.println(" string value " + value);

        return  value.toString()+ ".jpg";

    }

}