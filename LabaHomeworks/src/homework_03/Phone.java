
package homework_03;

import java.util.Objects;

public abstract class Phone {

	protected String color;
	protected int memoryCapacity;
	protected double phoneWeight;

	public abstract void helloMassage();

	@Override
	public int hashCode() {
		return Objects.hash(color, memoryCapacity, phoneWeight);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(color, other.color) && memoryCapacity == other.memoryCapacity
				&& Double.doubleToLongBits(phoneWeight) == Double.doubleToLongBits(other.phoneWeight);
	}

	@Override
	public String toString() {
		return "color: " + color + ", memoryCapacity: " + memoryCapacity + ", phoneWeight: " + phoneWeight + ",";
	}

	public Phone(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMemoryCapacity() {
		return memoryCapacity;
	}

	public void setMemoryCapacity(int memoryCapacity) {
		this.memoryCapacity = memoryCapacity;
	}

	public double getPhoneWeight() {
		return phoneWeight;
	}

	public void setPhoneWeight(int phoneWeight) {
		this.phoneWeight = phoneWeight;
	}

}
