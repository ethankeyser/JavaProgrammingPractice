package keyser.ethan;

public class Cuboid extends Rectangle{

    private double height;

    public Cuboid(double length, double width, double height) {
        super(height, width);
        if(height < 0)
            this.height = 0;
        else
            this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return super.getLength() * super.getWidth() * this.height;
    }

}
