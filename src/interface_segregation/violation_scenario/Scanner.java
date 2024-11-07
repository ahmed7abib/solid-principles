package interface_segregation.violation_scenario;

public class Scanner implements IPrinter {

    @Override
    public void print() {
        // todo not needed implementation
    }

    @Override
    public void scan() {
        System.out.println("Scanned.");
    }

    @Override
    public void fax() {
        // todo not needed implementation
    }
}