public class Pillow extends Throwable {
	private int softness;
	public Pillow() {
		this.softness = 1;
	}
	public Pillow(softness) {
		if ( softness < 0 ) {
			throw new NegativeNumberException("Negative softness not allowed: " + softness);
		}
		this.softness = softness;
	}
	public int getSoftness() { return softness; }
	public String getMessage() {
		return "Compiler got so distracted with this soft Pillow, so no compilation could occur.";
	}
}
