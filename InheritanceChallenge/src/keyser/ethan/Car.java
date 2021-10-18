package keyser.ethan;

public class Car extends Vehicle{

    private int gear;

    public Car(int speed, int weight, int handSteering, int gear) {
        super(speed, weight, handSteering);
        this.gear = gear;
    }

    @Override
    public void move(int speed) {
        System.out.println("Car is moving at " + speed + "mph");
    }

    public void changeGears(int gear) {
        this.gear = gear;
        System.out.println("Gear shifted to gear " + gear);
    }
}
