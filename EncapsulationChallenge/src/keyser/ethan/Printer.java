package keyser.ethan;

public class Printer {

    private int tonerLevel;
    private boolean isDuplex;
    private int pagesPrinted;

    public Printer(int tonerLevel, boolean isDuplex, int pagesPrinted) {
        if(tonerLevel > 0) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = pagesPrinted;
    }

    public void printPages(int pages, boolean isOneSided) {
        if(this.isDuplex) {
            this.pagesPrinted = this.pagesPrinted + pages;
        } else if(!this.isDuplex && !isOneSided) {
            System.out.println("Not a duplex printer!");
        } else {
            this.pagesPrinted += pages;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void addToner(int percentage) {
        if (percentage + this.tonerLevel <= 100) {
            this.tonerLevel += percentage;
        }
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
