package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Children {

    List<Widgets> widgetsList=new ArrayList<Widgets>();

    public List<Widgets> getWidgetsList() {
        return widgetsList;
    }

    public void setWidgetsList(List<Widgets> widgetsList) {
        this.widgetsList = widgetsList;
    }

    @Override
    public String toString() {
        return "Children{\n" +
                widgetsList +
                "\n}";
    }
}
