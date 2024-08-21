package homework_04;

import java.util.Objects;

public class Display {
	protected int x;
	protected int y;

	public Display(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Display other = (Display) obj;
		return x == other.x && y == other.y;
	}



	@Override
	public String toString() {
		return "x: " + x + ", y: " + y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
