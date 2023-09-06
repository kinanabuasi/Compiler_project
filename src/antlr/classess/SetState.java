package antlr.classess;

public class SetState {
    Widgets widgets;

    public Widgets getWidgets() {
        return widgets;
    }

    public void setWidgets(Widgets widgets) {
        this.widgets = widgets;
    }

    @Override
    public String toString() {
        return "SetState(\n" +
                widgets +
                ")\n";
    }
}
//setState : SetState OQFUNC  OQFUNC CQFUNC OQCLASS widgets CQCLASS CQFUNC COMA ;
