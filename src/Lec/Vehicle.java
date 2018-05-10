package Lec;

public class Vehicle {
	protected double weightInKg;
	protected double speedInKmPerHr;
	protected Direction direction;

	public Vehicle() {
	}

	public Vehicle(double weightInKgIn, double speedIn) {
		weightInKg = weightInKgIn;
		speedInKmPerHr = speedIn;
		direction = new Direction(0, 0);
	}

	public void steer(double bearing, double angle) {
		direction.setDirection(bearing, angle);
	}

	public void accelerate(double speedIncrement) {
		speedInKmPerHr += speedIncrement;
	}

	public String toString() {
		return "vehicle weighs " + weightInKg + " kg: is going "
				+ speedInKmPerHr + ": " + direction.toString();
	}
}
