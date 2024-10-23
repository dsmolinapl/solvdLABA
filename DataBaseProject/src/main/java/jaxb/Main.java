package jaxb;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.File;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class Main {
	public static void main(String[] args) throws JAXBException, IOException, ParseException {
		
		
		// “id” is not output to the console because of the annotated name change
		Customers customers = unmarshal();
		
		Country country = customers.getList().get(0).getCountry(); // Get the first customer
		System.out.println("Country Name: " + country.getNameCountry());
		System.out.println(unmarshal());
		//System.out.println(customers.getList().getFirst().getCountry());
		marshal();
	}

	public static void marshal() throws JAXBException, IOException {
        Customer iryna = new Customer(4,"Iryna", 33,  new Country("USA","English"), new Date());
        Customer nika = new Customer(5,"Nika", 90,  new Country("Poland","Polish"), new Date());
        Customers customers = new Customers();
        List<Customer> list = new ArrayList<>();
        list.add(iryna);
        list.add(nika);
        customers.setList(list);

        JAXBContext context = JAXBContext.newInstance(Customers.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(customers, new File("src\\main\\java\\jaxb\\newCustomers.xml"));
	}	
	 public static Customers unmarshal() throws JAXBException, IOException {
	        JAXBContext context = JAXBContext.newInstance(Customers.class);
	        return (Customers) context.createUnmarshaller()
	                .unmarshal(new FileReader("src\\main\\java\\jaxb\\customers2024.xml"));
	    }

		
	}

