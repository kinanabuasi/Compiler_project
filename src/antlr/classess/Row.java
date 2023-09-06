package antlr.classess;

public class Row {

Children children;

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "\nRow{" +
               children +
                "}\n";
    }
}

