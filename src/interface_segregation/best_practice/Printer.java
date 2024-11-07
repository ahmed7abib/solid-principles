package interface_segregation.best_practice;

public class Printer implements IPrinter {

    @Override
    public void print() {
        System.out.println("Doc printed.");
    }
}
