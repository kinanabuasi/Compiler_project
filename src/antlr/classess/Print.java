package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Print {

    List<Value> printlist=new ArrayList<>();

    public List<Value> getPrintlist() {
        return printlist;
    }

    public void setPrintlist(List<Value> printlist) {
        this.printlist = printlist;
    }

    @Override
    public String toString() {
        return "\nPrint{" +
                 printlist +
                "}\n";
    }
}
//print: PRINT OQFUNC (value (COMA1 value)*)* CQFUNC COMA ;
