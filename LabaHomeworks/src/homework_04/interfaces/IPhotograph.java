package homework_04.interfaces;

public interface IPhotograph {

	void photograph();

	default void zoom(int zoomRatio) {
		System.out.println(" Zoom ratio: " + zoomRatio);
	}

}
