package homework_05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import homework_05.exceptions.WrongAgeException;
import homework_05.exceptions.WrongBreedException;
import homework_05.exceptions.WrongColorException;
import homework_05.exceptions.WrongNameException;

public class Main {
	private static  final  Logger LOGGER = LogManager.getLogger();
	public static void main(String[] args) throws WrongBreedException, WrongColorException {

		Dog dog = new Dog();

		dog.setBreed("Poodle");
		dog.setCommands("dance");
		dog.setColor("blue");

		try {
			dog.setAge(-10);
		} catch (WrongAgeException e) {
			LOGGER.info("Skipping age error");
		}
		try {
			dog.setName("Bobby");
		} catch (WrongNameException e) {
			LOGGER.info("Skipping name error");
		}
		try (Scanner scanner = new Scanner(System.in)) { // Scanner object
			int a = Integer.parseInt(scanner.next());
			LOGGER.info("You entered: " + a);
		} catch (NumberFormatException e) {
			LOGGER.info("Wrong number!");
		}
		try (FileReader fileReader = new FileReader("src/homework_05/infoDog.txt")) {
			LOGGER.info(fileReader.read());
		} catch (FileNotFoundException e) {
			LOGGER.info("File not found!");
		} catch (IOException e) {
			LOGGER.info("IO exception!");
		}
	}

}
