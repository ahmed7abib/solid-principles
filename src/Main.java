import dependency_inversion.DIPProgram;
import interface_segregation.ISPProgram;
import liskov_substitution.LSPProgram;
import open_closed.OCPProgram;
import single_responsbility.SRPProgram;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n------------------------- S.R.P ---------------------\n");
        SRPProgram.srpDemo();

        System.out.println("\n------------------------- O.C.P ---------------------\n");
        OCPProgram.ocpDemo();

        System.out.println("\n------------------------- L.S.P ---------------------\n");
        LSPProgram.lspViolationDemo();
        LSPProgram.lspBestPracticeWithInheritance();
        LSPProgram.lspBestPracticeWithAbstraction();

        System.out.println("\n------------------------- I.S.P ---------------------\n");
        ISPProgram.ispDemo();

        System.out.println("\n------------------------- D.I.P ---------------------\n");
        DIPProgram.dipDemo();
    }
}