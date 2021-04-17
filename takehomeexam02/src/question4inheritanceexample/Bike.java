package question4inheritanceexample;

public class Bike extends Vehicle {

    private int seats;

    public Bike(boolean geared, int wheels, int seats) {
        super(geared, wheels);
        // TODO Auto-generated constructor stub
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Bike seats: " + seats + " isGeared():" + isGeared() + " getWheels(): " + getWheels();
    }

}
