package antlr.classess;

public class Border1 {
    String OutlineInputBorder;

    public String getOutlineInputBorder() {
        return OutlineInputBorder;
    }

    public void setOutlineInputBorder(String outlineInputBorder) {
        OutlineInputBorder = outlineInputBorder;
    }

    @Override
    public String toString() {
        return "Border:\n"+OutlineInputBorder+"\n";
    }
}
