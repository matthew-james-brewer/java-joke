public class Ball extends Throwable {
	private int radius;
	public Ball() {
		this.radius = 1;
	}
	public Ball(int radius) throws NegativeNumberException {
		if ( radius < 0 ) {
			throw new NegativeNumberException("Negative radius not allowed: " + radius);
		}
		this.radius = radius;
	}
	public int getRadius() {
		return this.radius;
	}
	public String getMessage() {
		return "The compiler got knocked out because Ball of radius "+radius+" thrown and hit compiler.";
	}
}
