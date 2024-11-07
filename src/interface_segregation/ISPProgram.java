package interface_segregation;

import interface_segregation.best_practice.*;

public class ISPProgram {

    public static void ispDemo() {
        IFax fax = new Fax();
        fax.fax();
        System.out.println();

        IPrinter printer = new Printer();
        printer.print();
        System.out.println();

        ISuperPrinter superPrinter = new SuperPrinter();
        superPrinter.fax();
        superPrinter.print();
        superPrinter.scan();
    }
}
