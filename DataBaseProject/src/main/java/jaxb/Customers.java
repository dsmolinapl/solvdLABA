package jaxb;

import java.util.List;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "customers")
public class Customers {

	private List<Customer> list;
	  
	public List<Customer> getList() {
		return list;
	}
	@XmlElement(name = "customer")
	public void setList(List<Customer> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Customers [list=" + list + "]";
	}

	

}
