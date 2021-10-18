package keyser.ethan;

public class Room {
    private int carpet;
    private int couch;
    private int tv;
    private int lights;
    private lights Lights;


    public Room(int carpet, int couch, int tv, int lights, lights Lights) {
        this.carpet = carpet;
        this.couch = couch;
        this.tv = tv;
        this.lights = lights;
        this.Lights = Lights;
    }

    public int getCarpet() {
        return this.carpet;
    }

    public int getCouch() {
        return couch;
    }

    public int getTv() {
        return tv;
    }

    public int getLights() {
        return lights;
    }

    public void turnOnLights(int brightness, String color) {
        Lights.turnOnLights(brightness, color);
    }


}
