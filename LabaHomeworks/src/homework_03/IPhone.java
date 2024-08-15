package homework_03;

import java.util.Objects;

public class IPhone extends Phone {

	private String brand = "IPhone";
	private boolean isButtons;
	private Display display = new Display(414, 896);

	public IPhone(String color) {
		super(color);

	}

	@Override
	public String toString() {
		String result = super.toString();
		return result + " brand: " + brand + " , isButtons: " + isButtons + ", display: " + display.toString();
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(brand, display, isButtons);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IPhone other = (IPhone) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(display, other.display)
				&& isButtons == other.isButtons;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public void setMemoryCapacity(int memoryCapacity) {
		if (memoryCapacity != 64 && memoryCapacity != 128 && memoryCapacity != 256) {
			System.out.println(" Incorrect value. Please check if the data is correct.");
		} else
			this.memoryCapacity = memoryCapacity;
	}

	public boolean isButtons() {
		return isButtons;
	}

	public void setButtons(boolean isButtons) {
		this.isButtons = isButtons;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public void helloMassage() {
		System.out.println("Hello, " + brand + "'s user!");
		
	}

}
