package homework_04;

public class Main {
	public static void main(String[] args) {

		IPhone myIPhone = new IPhone("white");
		IPhone myIPhone2 = new IPhone("white");
		Motorola myMotorola = new Motorola("black");
		Samsung mySamsung = new Samsung(true, "white");
		Vivo myVivo = new Vivo("white");
		Xiaomi myXiaomi = new Xiaomi("blue");

		Headphones iPhoneHeadphones = new Headphones("IPhone");
		Headphones samsungHeadphones = new Headphones("Samsung");
		System.out.println("WireLength IPhone: " + iPhoneHeadphones.WireLength);
		System.out.println("WireLength Samsung: " + samsungHeadphones.WireLength);
		Headphones.soundVolume = 30;
		System.out.println(Headphones.soundVolume);

		myIPhone.call();
		myIPhone.photograph();
		myIPhone.hangUp();
		myIPhone.zoom(6);
		myIPhone.amount(1, 7);
		myIPhone.light(true);
		

	}

}
