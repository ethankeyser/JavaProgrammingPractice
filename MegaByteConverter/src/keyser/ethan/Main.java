package keyser.ethan;

public class Main {

    public static void main(String[] args) {
        convertKBtoMB(2500);
    }

    public static void convertKBtoMB(int KB) {
        int MB;
        int remain;
        MB = Math.floorDiv(KB, 1024);
        remain = KB - MB * 1024;
        System.out.println(KB + " KB = " + MB + " MB " + " and " + remain + " KB");

    }
}
