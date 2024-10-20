package jsonJackson;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {

		ObjectMapper objectMapper = new ObjectMapper();

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		objectMapper.setDateFormat(df);
		
		Animal animal = new Animal("Cat", "Kolli", 12, new Date(), new Parent("Roni", 16),
				new Owner("Darya", "768-99-08"), new Country("Poland","EUR"), new Feeding(true,"predator"));
		objectMapper.writeValue(new File("src/main/java/jsonJackson/kolli.json"), animal);


		List<Animal> animalReadJson1 = objectMapper.readValue(new File("src/main/java/jsonJackson/arrayAnimals.json"),
				new TypeReference<List<Animal>>() {
				});
		System.out.println(animalReadJson1);

		Animal animalReadJson = objectMapper.readValue(new File("src/main/java/jsonJackson/animals.json"),
				Animal.class);
		System.out.println("My animal: " + animalReadJson);
	}

}
