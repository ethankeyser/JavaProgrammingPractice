package keyser.ethan;

public class Bed {
    private String style;
    private int pillows;
    private int heights;
    private int sheets;
    private int blankets;

    public Bed(String style, int pillows, int heights, int sheets, int blankets) {
        this.style = style;
        this.pillows = pillows;
        this.heights = heights;
        this.sheets = sheets;
        this.blankets = blankets;
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeights() {
        return heights;
    }

    public int getSheets() {
        return sheets;
    }

    public int getBlankets() {
        return blankets;
    }

    public void make() {

    }
}
