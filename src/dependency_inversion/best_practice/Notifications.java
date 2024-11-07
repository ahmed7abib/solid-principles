package dependency_inversion.best_practice;

public class Notifications {

    private final IMail iMail;

    public Notifications(IMail iMail) {
        this.iMail = iMail;
    }

    public void sendEmail() {
        iMail.sendEmail();
    }
}
