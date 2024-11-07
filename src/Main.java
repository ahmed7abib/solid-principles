import liskov_substitution.LSPProgram;
import open_closed.OCPProgram;
import single_responsbility.SRPProgram;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n-------- S.R.P -----------\n");
        SRPProgram.SRPDemo();

        System.out.println("\n-------- O.C.P -----------\n");
        OCPProgram.OCPDemo();

        System.out.println("\n-------- L.S.P -----------\n");
        LSPProgram.LSPDemo();
    }
}