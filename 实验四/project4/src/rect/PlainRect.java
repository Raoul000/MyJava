package rect;

public class PlainRect extends Rect {
	protected double starX;
	protected double starY;

	public PlainRect(double width, double height, double starX, double starY) {
		super(width, height);
		this.starX = starX;
		this.starY = starY;
	}

	public PlainRect() {
		super(0, 0);
		this.starX = 0;
		this.starY = 0;
	}

	public boolean isInside(double x, double y) {
		if (this.starX + super.width < x || this.starY + super.height < y) {
			return false;
		} else
			return true;
	}

	@Override
	public String toString() {
		return "PlainRect [starX=" + starX + ", starY=" + starY + ", height=" + height + ", width=" + width + "]";
	}

}
