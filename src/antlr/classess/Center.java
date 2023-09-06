package antlr.classess;

public class Center {
    Child child;

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Center{\n" +
                child +
                "\n}";
    }
}
