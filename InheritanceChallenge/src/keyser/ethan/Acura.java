package keyser.ethan;

public class Acura extends Car{


    private String model;

    public Acura(int speed, int weight, int handSteering, int gear, String model) {
        super(speed, weight, handSteering, gear);
        this.model = model;
    }

    @Override
    public void move(int speed) {
        if(!model.equals(""))
            System.out.println(model + "is moving at " + speed + "mph");
        else
            System.out.println("Acura is moving at " + speed + "mph");
    }
}
