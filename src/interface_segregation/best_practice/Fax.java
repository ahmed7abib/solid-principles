package interface_segregation.best_practice;

public class Fax implements IFax {

    @Override
    public void fax() {
        System.out.println("Fax sent.");
    }
}
