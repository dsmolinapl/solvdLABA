package homework_05;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import homework_05.exceptions.WrongAgeException;
import homework_05.exceptions.WrongBreedException;
import homework_05.exceptions.WrongColorException;
import homework_05.exceptions.WrongNameException;

public class Main {
	public static void main(String[] args) throws WrongBreedException, WrongColorException {

		Dog dog = new Dog();

		dog.setBreed("Poodle");
		dog.setCommands("dance");
		dog.setColor("blue");

		try {
			dog.setAge(-10);
		} catch (WrongAgeException e) {
			System.out.println("Skipping age error");
		}
		try {
			dog.setName("Bobby");
		} catch (WrongNameException e) {
			System.out.println("Skipping name error");
		}
		try (Scanner scanner = new Scanner(System.in)) { // Scanner object
			int a = Integer.parseInt(scanner.next());
			System.out.println("You entered: " + a);
		} catch (NumberFormatException e) {
			System.out.println("Wrong number!");
		}
		try (FileReader fileReader = new FileReader("src/homework_05/infoDog.txt")) {
			System.out.println(fileReader.read());
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			System.out.println("IO exception!");
		}
	}

}
