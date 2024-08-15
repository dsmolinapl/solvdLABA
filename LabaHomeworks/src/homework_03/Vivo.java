package homework_03;

public class Vivo extends Phone {
	private String brand = "Vivo";
	private Display display = new Display(390, 844);

	@Override
	public String toString() {
		String result = super.toString();
		return result + "brand: " + brand + ", display: " + display.toString();
	}

	public Vivo(String color) {
		super(color);
	}

	public void setColor(String color) {
		if (color == "blue" || color == "black" || color == "white") {
			System.out.println("It is a great choice" + color);
		}
		this.color = color;
	}

	public int getMemoryСapacity() {
		return memoryCapacity;
	}

	public void setMemoryСapacity(int memoryСapacity) {
		if (memoryСapacity != 64 && memoryСapacity != 128 && memoryСapacity != 256) {
			System.out.println(" Incorrect value. Please check if the data is correct.");
		} else
			this.memoryCapacity = memoryСapacity;
	}

	public String getBrand() {
		return brand;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	@Override
	public void helloMassage() {
		System.out.println("Hello, " + brand + "'s user!");
		
	}

}
