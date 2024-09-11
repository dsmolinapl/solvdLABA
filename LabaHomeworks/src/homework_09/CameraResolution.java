package homework_09;

public enum CameraResolution {
	LOW_RESOLUTION(10),
	MEDIUM_RESOLUTION(32),
	HIGH_RESOLUTION(48),
	SUPER_RESOLUTION(50);
	
	private int resolution;

	public int getResolution() {
		return resolution;
	}

	private CameraResolution(int resolution) {
		this.resolution = resolution;
	}
	
	

}
