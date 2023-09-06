package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Void_Function {

String VOID,ID;
List<Parameters> parameters=new ArrayList<Parameters>();
List<Line> stetements=new ArrayList<Line>();

    public String getVOID() {
        return VOID;
    }

    public void setVOID(String VOID) {
        this.VOID = VOID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<Parameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameters> parameters) {
        this.parameters = parameters;
    }

    public List<Line> getStetements() {
        return stetements;
    }

    public void setStetements(List<Line> stetements) {
        this.stetements = stetements;
    }

    @Override
    public String toString() {
        return "\nVoid Function{\n" +
                VOID+" "+ID+"( "+parameters+" )\n"
                +"{ "+stetements+" }\n";

    }
}
