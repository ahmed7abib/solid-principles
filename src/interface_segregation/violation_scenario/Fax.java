package interface_segregation.violation_scenario;

public class Fax implements IPrinter {

    @Override
    public void print() {
        // todo not needed implementation
    }

    @Override
    public void scan() {
        // todo not needed implementation
    }

    @Override
    public void fax() {
        System.out.println("Fax sent.");
    }
}
