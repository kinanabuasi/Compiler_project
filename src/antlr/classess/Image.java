package antlr.classess;

public class Image {

   String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "\nImage name:" + ID +"\n";
    }
}
