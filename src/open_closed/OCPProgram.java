package open_closed;

import open_closed.best_practice.Head;
import open_closed.best_practice.Manager;
import open_closed.best_practice.RegularEmployee;

public class OCPProgram {

    public static void ocpDemo() {
        Manager manager = new Manager(1, "Ahmed", 50000);
        Head head = new Head(2, "Mohamed", 30000);
        RegularEmployee regularEmployee = new RegularEmployee(3, "Sami", 10000);

        System.out.println("Manager : " + manager + ", His Bonus: " + (int) manager.calculateBonus(5));
        System.out.println("Head : " + head + ", His Bonus: " + (int) head.calculateBonus(5));
        System.out.println("Regular Emp : " + regularEmployee + ", His Bonus: " + (int) regularEmployee.calculateBonus(5));
    }
}
