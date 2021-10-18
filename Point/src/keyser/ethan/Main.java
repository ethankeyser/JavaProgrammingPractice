package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        point first = new point(6, 5);
        point second = new point(3, 1);
        System.out.println(first.distance());
        System.out.println(first.distance(second));
        System.out.println(first.distance(2, 2));
        point p = new point();
        System.out.println(p.distance());
    }
}
