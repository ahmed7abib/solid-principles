package interface_segregation.violation_scenario;

public class Printer implements IPrinter {

    @Override
    public void print() {
        System.out.println("Printed.");
    }

    @Override
    public void scan() {
        // todo not needed implementation
    }

    @Override
    public void fax() {
        // todo not needed implementation
    }
}
