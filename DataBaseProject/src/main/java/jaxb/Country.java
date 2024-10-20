package jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.XmlType;

public class Country {

	private String nameCountry;
	private String language;

	public Country(String nameCountry, String language) {
		super();
		this.nameCountry = nameCountry;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Country [nameCountry=" + nameCountry + ", language=" + language + "]";
	}


	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public String getLanguage() {
		return language;
	}

	//@XmlTransient
	public void setLanguage(String language) {
		this.language = language;
	}

	public Country() {
	}

}
