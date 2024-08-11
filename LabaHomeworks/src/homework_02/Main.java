package homework_02;

public class Main {
	public static void main (String[]args) {
		
		IPhone myIPhone = new IPhone("white");
		Motorola myMotorola = new Motorola("blue");
		Samsung mySamsung = new Samsung(true);
		Vivo myVivo = new Vivo("pink");
		Xiaomi myXiaomi = new Xiaomi("blue");
		
		myIPhone.setMemoryСapacity(256);
		System.out.println(myIPhone.getMemoryСapacity());
		
		myMotorola.setPhoneWeight(1.3);
		System.out.println(myMotorola.getPhoneWeight());
		myMotorola.setMemoryСapacity(156);
		System.out.println(myMotorola.getMemoryСapacity());
		
		
		
		
	}

}
