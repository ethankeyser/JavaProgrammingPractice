package keyser.ethan;

public class Main {

    public static void main(String[] args) {

        int val = 10000;

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.println("Minimum Value = " + min);
        System.out.println("Maximum Value = " + max);

        byte minByte = Byte.MIN_VALUE;
        int maxByte = Byte.MAX_VALUE;
        System.out.println("Minimum Value = " + minByte);
        System.out.println("Maximum Value = " + maxByte);

        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("Minimum Value = " + minShort);
        System.out.println("Maximum Value = " + maxShort);

        long val1 = 100L;

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("Minimum Value = " + minLong);
        System.out.println("Maximum Value = " + maxLong);

        byte newByte = (byte)(minByte / 2);

        short newShort = (short)(minShort / 2);

        byte vc = 100;
        short sc = 1000;
        int ic = 10000;

        long cTotal = 50000L + (10 * (vc + sc + ic));

        System.out.println(cTotal);


    }
}
