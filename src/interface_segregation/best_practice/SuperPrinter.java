package interface_segregation.best_practice;

public class SuperPrinter implements ISuperPrinter {

    @Override
    public void fax() {
        System.out.println("Fax sent.");
    }

    @Override
    public void print() {
        System.out.println("Doc printed.");
    }

    @Override
    public void scan() {
        System.out.println("Doc Scanned.");
    }
}
