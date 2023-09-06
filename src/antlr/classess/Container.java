package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Container {

    List<Container_Body> container_body = new ArrayList<Container_Body>();

    Child child;

    public List<Container_Body> getContainer_body() {
        return container_body;
    }

    public void setContainer_body(List<Container_Body> container_body) {
        this.container_body = container_body;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "Container(\n" +
                container_body +
                child +
                "\n)\n";
    }
}
//container: Container OQFUNC width hieght (container_decoration)? child  CQFUNC (COMA|COMA1);
