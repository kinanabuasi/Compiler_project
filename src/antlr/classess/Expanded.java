package antlr.classess;

public class Expanded {

    Child child;

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Expanded(\n" +
                 child +
                "\n)\n";
    }
}
