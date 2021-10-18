package keyser.ethan;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        System.out.println("Object Created");
    }

    public Wall(double width, double height) {
        if(width >= 0) {
            this.width = width;
        } else {
            this.width = 0;
        }

        if(height >= 0) {
            this.height = height;
        } else {
            this.height = 0;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }
}
