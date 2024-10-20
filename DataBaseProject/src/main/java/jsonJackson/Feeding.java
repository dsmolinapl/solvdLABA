package jsonJackson;

public class Feeding {
	private boolean atNight;
	private String type;

	public boolean isAtNight() {
		return atNight;
	}

	public void setAtNight(boolean atNight) {
		this.atNight = atNight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Feeding [atNight=" + atNight + ", type=" + type + "]";
	}

	public Feeding(boolean atNight, String type) {
		super();
		this.atNight = atNight;
		this.type = type;
	}

	public Feeding() {

	}

}
