package keyser.ethan;

public class point {

    private int x;
    private int y;

    public point() {
        this(0, 0);
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance = x*x + y*y;
        distance = Math.sqrt(distance);
        return distance;
    }

    public double distance(int x, int y) {
        int xParam = Math.abs(this.x - x);
        int yParam = Math.abs(this.y - y);
        double distance = xParam*xParam + yParam*yParam;
        distance = Math.sqrt(distance);
        return distance;
    }

    public double distance(point p) {
        int xParam = Math.abs(this.x - p.getX());
        int yParam = Math.abs(this.y - p.getY());
        double distance = xParam*xParam + yParam*yParam;
        distance = Math.sqrt(distance);
        return distance;
    }
}
