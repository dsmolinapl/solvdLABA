package homework_03;

public class Main {
	public static void main(String[] args) {

		IPhone myIPhone = new IPhone("white");
		IPhone myIPhone2 = new IPhone("white");
		Motorola myMotorola = new Motorola("black");
		Samsung mySamsung = new Samsung(true, "white");
		Vivo myVivo = new Vivo("white");
		Xiaomi myXiaomi = new Xiaomi("blue");

		System.out.println("Equals for Displays : " + myIPhone.getDisplay().equals(myXiaomi.getDisplay()));
		System.out.println("Equals for color, memoryCapacity, phoneWeight : " + myMotorola.equals(mySamsung));
		System.out.println("myIPhone hashCode : " + myIPhone.hashCode());

		myIPhone.setMemoryCapacity(256);
		System.out.println(myIPhone.getMemoryCapacity());

		myMotorola.setPhoneWeight(1.3);
		System.out.println(myMotorola.getPhoneWeight());
		myMotorola.setMemoryСapacity(64);
		System.out.println(myMotorola.getMemoryCapacity());

		System.out.println(myIPhone.toString());
		System.out.println(myMotorola.toString());
		System.out.println(mySamsung.toString());
		System.out.println(myVivo.toString());
		System.out.println(myXiaomi.toString());

	}

}
