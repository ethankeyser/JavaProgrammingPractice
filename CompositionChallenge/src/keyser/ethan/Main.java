package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall1 = new Wall("west");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, "Red");

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("ethan", wall1, wall2, wall3, wall4, ceiling, lamp, bed);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
