package question4inheritanceexample;

public class Vehicle {
	
	private boolean geared;
	
	private int wheels;

	public Vehicle(boolean geared, int wheels) {
		
		this.geared = geared;
		this.wheels = wheels;
	}

	public boolean isGeared() {
		return geared;
	}

	public int getWheels() {
		return wheels;
	}

	public void setGeared(boolean geared) {
		this.geared = geared;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Vehicle geared: " + geared + ", wheels: " + wheels;
	}
	
	

}
