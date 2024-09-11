package homework_09;

public enum Camera {
	
	REAR_CAMERA("rear camera",CameraResolution.HIGH_RESOLUTION),
	DOUBLE_REAR_CAMERA("double rear camera",CameraResolution.SUPER_RESOLUTION),
	FRONT_CAMERA("front camera", CameraResolution.LOW_RESOLUTION);
	
	private String camera;
	private CameraResolution cameraResolution;
	
	
	private Camera(String camera, CameraResolution cameraResolution) {
		this.camera = camera;
		this.cameraResolution = cameraResolution;
	}
	public String getCamera() {
		return camera;
	}
	public CameraResolution getCameraResolution() {
		return cameraResolution;
	}


}
