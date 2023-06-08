public class Ball extends Throwable {
	private int radius;
	public Ball() {this.radius = 1;}
	public Ball(int radius) {this.radius = radius;}
	public int getRadius() {return this.radius;}
	public String getMessage() {
	return "Ball of radius "+radius+" thrown, and the compiler got knocked out.";
	}
}
