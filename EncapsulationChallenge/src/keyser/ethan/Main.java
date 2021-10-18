package keyser.ethan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer = new Printer(78, false, 0);

        printer.addToner(12);
        printer.addToner(34);

        printer.printPages(30, true);

        System.out.println(printer.getPagesPrinted());
    }
}
