package antlr.classess;

public class HintText {


    String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nHint text: " + ID +
                "\n";
    }
}
