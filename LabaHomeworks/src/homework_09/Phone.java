package homework_09;

public enum Phone {
	SAMSUNG("samsung", Camera.REAR_CAMERA) {
		@Override
		public String getName() {
			return "samsung -  all rights reserved";
		}
	},
	NIKIA("nokia", Camera.DOUBLE_REAR_CAMERA),
	MOTOROLA("motorola", Camera.FRONT_CAMERA);

	private String name;
	private Camera camera;

	public String getName() {
		return name;
	}

	public Camera getCamera() {
		return camera;
	}

	private Phone(String name, Camera camera) {
		this.name = name;
		this.camera = camera;
	}

}
