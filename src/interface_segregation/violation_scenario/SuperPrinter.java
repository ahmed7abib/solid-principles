package interface_segregation.violation_scenario;

public class SuperPrinter implements IPrinter {

    @Override
    public void print() {
        System.out.println("Printed.");
    }

    @Override
    public void scan() {
        System.out.println("Scanned.");
    }

    @Override
    public void fax() {
        System.out.println("Fax sent.");
    }
}