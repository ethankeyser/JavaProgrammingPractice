package keyser.ethan;

public class Vehicle {
    private int speed;
    private int weight;
    private int handSteering;

    public Vehicle(int speed, int weight, int handSteering) {
        this.speed = speed;
        this.weight = weight;
        this.handSteering = handSteering;
    }

    public void move(int speed) {
        System.out.println("Vehicle is moving at " + speed + "mph");
    }


}
