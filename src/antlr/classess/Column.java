package antlr.classess;

public class Column {

    Children children;

    public Children getChildren() {
        return children;
    }

    public void setChildren(Children children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Column{\n" +
                children +
                "\n}";
    }

}
