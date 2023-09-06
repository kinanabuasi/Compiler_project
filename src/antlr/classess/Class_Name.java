package antlr.classess;

public class Class_Name {

    String ID;
    String DOTEDART=".dart";

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDOTEDART(String DOTEDART) {
        this.DOTEDART = DOTEDART;
    }

    public String getID() {
        return ID;
    }

    public String getDOTEDART() {
        return DOTEDART;
    }

    @Override
    public String toString() {
        return "Class_Name{\n" +
                  ID + DOTEDART +
                "\n}";
    }
}
