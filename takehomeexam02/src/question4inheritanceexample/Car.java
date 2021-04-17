package question4inheritanceexample;

public class Car extends Vehicle {

    private boolean cabin;

    public Car(boolean geared, int wheels, boolean cabin) {
        super(geared, wheels);
        this.cabin = cabin;
    }

    public boolean isCabin() {
        return cabin;
    }

    public void setCabin(boolean cabin) {
        this.cabin = cabin;
    }

    @Override
    public String toString() {
        return "Car cabin: " + cabin + "  isGeared(): " + isGeared() + "  getWheels(): " + getWheels();
    }

}
