package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Normal_Class {

    String ABSTRACT;
    String CLASS;
    String ID;
    String EXTENDES;
    String CLASS2;

    List<Line> line=new ArrayList<Line>();

    public String getABSTRACT() {
        return ABSTRACT;
    }

    public String getCLASS() {
        return CLASS;
    }

    public String getID() {
        return ID;
    }

    public String getEXTENDES() {
        return EXTENDES;
    }

    public String getCLASS2() {
        return CLASS2;
    }

    public List<Line> getLine() {
        return line;
    }

    public void setABSTRACT(String ABSTRACT) {
        this.ABSTRACT = ABSTRACT;
    }

    public void setCLASS(String CLASS) {
        this.CLASS = CLASS;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setEXTENDES(String EXTENDES) {
        this.EXTENDES = EXTENDES;
    }

    public void setCLASS2(String CLASS2) {
        this.CLASS2 = CLASS2;
    }

    public void setLine(List<Line> line) {
        this.line = line;
    }

    @Override
    public String toString() {
        if (ABSTRACT != null && EXTENDES != null) {
            return "\nNormal_Class{\n" +
                    ABSTRACT + CLASS + ID + EXTENDES + CLASS2 +

                    "[  "+"\n"
                    +line
                    +"\n"+"  ]"+
                    '}';
        }
        else if (ABSTRACT != null && EXTENDES == null) {
            return "\nNormal_Class{\n" +
                    ABSTRACT + CLASS + ID +
                    "[  "+"\n"
                    +line
                    +"\n"+"  ]"+'}';
        }
        else if (ABSTRACT == null && EXTENDES != null) {
            return "\nNormal_Class{\n" +
                    CLASS + ID + EXTENDES + CLASS2 +
                    "[  "+"\n"
                    +line
                    +"\n"+"  ]"+
                    '}';
        }
        else if (ABSTRACT == null && EXTENDES == null)
            return "\nNormal_Class{\n" +
                    CLASS + ID +
                    "[  "+"\n"
                    +line
                    +"\n"+"  ]"+
                    '}';

        return "[  "+"\n"
                +line
                +"\n"+"  ]";


    }


}

