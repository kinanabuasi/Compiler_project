package antlr.classess;

public class Label {

    String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nLabel text:" + ID +
                "\n";
    }
}
