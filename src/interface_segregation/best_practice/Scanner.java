package interface_segregation.best_practice;

public class Scanner implements IScanner {

    @Override
    public void scan() {
        System.out.println("Doc Scanned.");
    }
}
