package jsonJackson;

public class Country {

	private String name;
	private String continent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", continent=" + continent + "]";
	}
	public Country(String name, String continent) {
		super();
		this.name = name;
		this.continent = continent;
	}
	public Country() {
	
	}
	
	
}
