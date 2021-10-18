package keyser.ethan;

public class lights {
    private String color;
    private int brightness;
    private boolean isOn;

    public lights(String color, int brightness, boolean isOn) {
        this.color = color;
        this.brightness = brightness;
        this.isOn = isOn;
    }

    public void turnOnLights(int brightness, String color) {
        if(!isOn) {
            this.brightness = brightness;
            this.color = color;
            this.isOn = true;
        } else {
            System.out.println("Lights are already on");
        }

    }

    public String getColor() {
        return color;
    }

    public int getBrightness() {
        return brightness;
    }

    public boolean isOn() {
        return isOn;
    }

    public void changeBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void changeColor(String color) {
        this.color = color;
    }
}
