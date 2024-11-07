package dependency_inversion;

import dependency_inversion.best_practice.Gmail;
import dependency_inversion.best_practice.Hotmail;
import dependency_inversion.violation_scenario.Notifications;

public class DIPProgram {

    public static void dipDemo() {

        System.out.println("------------ VIOLATION EXAMPLE ----------------\n");

        Notifications notifications = new Notifications();
        notifications.senGmailNotification();
        notifications.sendHotmailNotification();

        System.out.println("\n------------ Best Practice EXAMPLE ----------------\n");

        dependency_inversion.best_practice.Notifications notifications1;

        notifications1 = new dependency_inversion.best_practice.Notifications(new Gmail());
        notifications1.sendEmail();

        notifications1 = new dependency_inversion.best_practice.Notifications(new Hotmail());
        notifications1.sendEmail();
    }
}
