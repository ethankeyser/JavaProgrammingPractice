package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        double KMH = 50;
        long convertedValue = toMPH(KMH);
        System.out.println(convertedValue);
        printConversion(KMH);
    }

    public static long toMPH(double kmh) {
        long mph;
        if(kmh >= 0) {
            mph = Math.round(kmh / 1.609);
        } else
        {
            mph = -1;
        }



        return mph;
    }

    public static void printConversion(double kmh) {
        long mph;
        if(kmh < 0) {
            System.out.println("Invalid Value");
        } else {
            mph = Math.round(kmh / 1.609);
            System.out.println(kmh + " kmh = " + mph + " mph");
        }
    }
}
