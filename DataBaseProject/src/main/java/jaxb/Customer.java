package jaxb;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;

@XmlType(propOrder = { "id", "name", "age", "country","date" })
public class Customer {

	private int id;
	private String name;
	private int age;
	private Country country;
	private Date date;
	
	  public Customer() {
	    }

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + ", date=" + date
				+ "]";
	}

	public Customer(int id, String name, int age, Country country, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
		this.date = date;
	}

	public int getId() {
		return id;
	}
	@XmlAttribute (name = "ID")
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	@XmlElement 
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	public Country getCountry() {
		return country;
	}
	@XmlElement (name = "residence")
	public void setCountry(Country country) {
		this.country = country;
	}

	public Date getDate() {
		return date;
	}

	@XmlJavaTypeAdapter(AdapterDate.class)
    public void setDate(Date date) {
        this.date = date;
    }

}
