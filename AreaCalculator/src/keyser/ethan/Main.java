package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        double area = Area(5);
        System.out.println(area);
    }

    public static double Area(double radius) {
        if(radius < 0) {
            return -1;
        }

        return radius * radius * Math.PI;
    }

    public static double Area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1;
        }

        return x * y;
    }
}
