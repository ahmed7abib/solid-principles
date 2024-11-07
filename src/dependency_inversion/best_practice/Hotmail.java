package dependency_inversion.best_practice;

public class Hotmail implements IMail {

    @Override
    public void sendEmail() {
        System.out.println("Sent email by Hotmail.");
    }
}
