package homework_09;

import java.lang.reflect.*;
import java.util.*;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
	final static Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {



		for (Phone phone : Phone.values()) {

			LOGGER.info("'" + phone.getName() + "' have camera : " + phone.getCamera().getCamera()
					+ " with resolution : " + phone.getCamera().getCameraResolution().getResolution());
		}

		ISum<CameraResolution> funcSumCamRes = (x, y) -> x.getResolution() + y.getResolution();
		IPrint<Laptop> funcPrintModelYear = (x) -> 2024 - x.getModelYear();

		IBetter<CameraResolution> funcBetCamRes = (x, y) -> (x.getResolution() > y.getResolution());

		LOGGER.info(funcSumCamRes.sum(CameraResolution.LOW_RESOLUTION, CameraResolution.HIGH_RESOLUTION));
		LOGGER.info(funcBetCamRes.better(CameraResolution.HIGH_RESOLUTION, CameraResolution.SUPER_RESOLUTION));
		LOGGER.info("your laptop already " + funcPrintModelYear.message(new Laptop(2020)) + " years");
		LOGGER.info("your laptop already " + funcPrintModelYear.message(new Laptop(2020)) + " years");
	}

}
