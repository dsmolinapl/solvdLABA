package homework_09;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		for (Phone phone : Phone.values()) {

			System.out.println("'" + phone.getName() + "' have camera : " + phone.getCamera().getCamera()
					+ " with resolution : " + phone.getCamera().getCameraResolution().getResolution());
		}

		ISum<CameraResolution> funcSumCamRes = (x, y) -> x.getResolution() + y.getResolution();
		IPrint<Laptop> funcPrintModelYear = (x) -> 2024 - x.getModelYear();

		IBetter<CameraResolution> funcBetCamRes = (x, y) -> (x.getResolution() > y.getResolution());

		System.out.println(funcSumCamRes.sum(CameraResolution.LOW_RESOLUTION, CameraResolution.HIGH_RESOLUTION));
		System.out.println(funcBetCamRes.better(CameraResolution.HIGH_RESOLUTION, CameraResolution.SUPER_RESOLUTION));
		System.out.println("your laptop already " + funcPrintModelYear.message(new Laptop(2020)) + " years");
	}

}
