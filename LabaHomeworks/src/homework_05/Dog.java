package homework_05;

import homework_05.exceptions.WrongAgeException;
import homework_05.exceptions.WrongBreedException;
import homework_05.exceptions.WrongColorException;
import homework_05.exceptions.WrongCommandsException;
import homework_05.exceptions.WrongNameException;

public class Dog {
	private String name;
	private int age;
	private String breed;// порода
	private String commands = "Jump";
	private String color;
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws WrongAgeException {
		if (age < 0) {
			throw new WrongAgeException("It's wrong age for dog! The age must be > 0 ");
		}
		if (age > 50) {
			throw new WrongAgeException("It's wrong age for dog! The age must be < 50 ");
		}
		System.out.println("Age is : " + age);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws WrongNameException {
		if (name.length() > 10) {
			throw new WrongNameException("Wrong name. You can enter < 10 letters ");
		}
		if (name.length() <= 0) {
			throw new WrongNameException("Please, enter the dog's name");
		}
		System.out.println("The name is : " + name);
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) throws WrongBreedException {
		if (breed.length() > 15) {
			throw new WrongBreedException("Wrong breed. You can enter < 15 letters ");
		}
		if (breed.length() == 0) {
			throw new WrongBreedException("Please, enter the dog's breed");
		}
		System.out.println("The breed is: " + breed);
		this.breed = breed;
	}

	public String getCommands() {
		return commands;
	}

	public void setCommands(String commands) throws WrongCommandsException {
		if (commands.length() == 0) {
			throw new WrongCommandsException("Please, enter commands");
		} else {
			if (commands.equals("jump")) {
				System.out.println("Dog can jump!");
			} else {
				if (commands.equals("lie")) {
					System.out.println("Dog can lie!");
				} else {
					if (commands.equals("sit")) {
						System.out.println("Dog can sit!");
					} else {
						if (commands.equals("dance")) {
							System.out.println("Dog can dance!");
						} else {
							throw new WrongCommandsException("These commands '"+ commands + "' are unknown");
						}
						this.commands = commands;
					}
				}
			}
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) throws WrongColorException {
		if (color.length() == 0) {
			throw new WrongColorException("Please, enter the dog's color");
		}
		if (color.length() > 10) {
			throw new WrongColorException("Wrong color. You can enter < 10 letters");
		}
		this.color = color;
		System.out.println("The dog's color  is : " + color);
	}

}
