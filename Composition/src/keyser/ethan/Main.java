package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Corsair", "500W", dimensions);

        Monitor monitor = new Monitor("31.5 inch", "Acer", 32, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("X 570 Gaming", "Gigabyte", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();
    }
}
