package homework_06;

import java.util.*;
import java.util.Objects;

import homework_04.interfaces.Callable;
import homework_04.interfaces.Flashlight;
import homework_04.interfaces.Gameable;
import homework_04.interfaces.ICalculate;
import homework_04.interfaces.IPhotograph;

public class IPhone extends Phone implements Callable, IPhotograph, Gameable, ICalculate, Flashlight {
	private String brand = "IPhone";
	private boolean isButtons;
	private Display display = new Display(414, 896);

	private List<Button> iphButton = new ArrayList<>();

	private Set<String> adress = new HashSet<>();

	public void addAdrress(String A) {
		adress.add(A);
	}

	private List<Integer> numModel = new ArrayList<>();

	public void addNumModel(Integer B) {
		numModel.add(B);

	}

	public List<Integer> getNumModel() {
		return numModel;
	}

	public void setNumModel(List<Integer> numModel) {
		this.numModel = numModel;
	}

	public Set<String> getAdress() {
		return adress;
	}

	public void setAdress(Set<String> adress) {
		this.adress = adress;
	}

	public IPhone(String color) {
		super(color);
		iphButton.add(new Button("volume buttons", "sound volume adjustment", 2));
		iphButton.add(new Button("side button", "screen lock", 1));
		adress.add(" Engels street, house 4");
		adress.add(" Brown lane, house 99 ");
		adress.add(" Moon Street, house 34 ");
		adress.add(" Scary Street, house 666 ");
		adress.add(" Moon Street, house 34 ");
		adress.add(" Moon Street, house 234 ");
		numModel.add(4);
		numModel.add(5);
		numModel.add(6);
		numModel.add(8);
		numModel.add(10);
		numModel.add(11);
		numModel.add(12);
		numModel.add(13);
		numModel.add(14);
		numModel.add(15);
	}

	public List<Button> getIphButton() {
		return iphButton;
	}

	public void setIphButton(List<Button> iphButton) {
		this.iphButton = iphButton;
	}

	@Override
	public void flashlight() {
		System.out.println("I have lashlight");
	}

	@Override
	public void calculate() {
		System.out.println("I can calculate");
	}

	@Override
	public void game() {
		System.out.println("I have games");
	}

	@Override
	public void call() {
		System.out.println("I can call");
	}

	@Override
	public void photograph() {

		System.out.println("I can photograph");
	}

	@Override
	public String toString() {
		return "IPhone [brand=" + brand + ", isButtons=" + isButtons + ", display=" + display + ", iphButton="
				+ iphButton + ", adress=" + adress + ", numModel=" + numModel + "]";
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
