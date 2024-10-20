package jsonJackson;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "type", "age", "name" })
public class Animal {

	private String type;
	@JsonProperty(value = "nickname")
	private String name;
	@JsonIgnore
	private int age;
	private Date date;
	private Parent parent;
	private Owner owner;
	private Country country;
	private Feeding feeding;

	public Feeding getFeeding() {
		return feeding;
	}

	public void setFeeding(Feeding feeding) {
		this.feeding = feeding;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Animal() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", age=" + age + ", date=" + date + ", parent=" + parent
				+ ", owner=" + owner + ", country=" + country + ", feeding=" + feeding + "]";
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	

	

	public Animal(String type, String name, int age, Date date, Parent parent, Owner owner, Country country,
			Feeding feeding) {
		super();
		this.type = type;
		this.name = name;
		this.age = age;
		this.date = date;
		this.parent = parent;
		this.owner = owner;
		this.country = country;
		this.feeding = feeding;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
