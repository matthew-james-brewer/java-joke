public class Ball extends Throwable {
	private int radius;
	public Ball() { this.radius = 1; }
	public Ball(int radius) { this.radius = radius; }
	public int getRadius() { return this.radius; }
	public String getMessage() {
		return "The compiler got knocked out because Ball of radius "+radius+" thrown and hit compiler.";
	}
}
