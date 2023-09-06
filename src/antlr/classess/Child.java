package antlr.classess;

public class Child {

    Widgets widget;

    public Widgets getWidget() {
        return widget;
    }

    public void setWidget(Widgets widget) {
        this.widget = widget;
    }

    @Override
    public String toString() {
        return "Child(\n"  + widget +
                "\n)";
    }
}
