package jaxb;

import jakarta.xml.bind.annotation.XmlTransient;

public class Country {

	private String name;

	public Country(String name, String language) {
		super();
		this.name = name;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", language=" + language + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}
@XmlTransient
	public void setLanguage(String language) {
		this.language = language;
	}

	private String language;

	public Country() {
	}

}
