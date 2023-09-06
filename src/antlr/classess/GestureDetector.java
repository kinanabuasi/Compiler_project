package antlr.classess;

public class GestureDetector {
    OnTap ontap;
    Child child;

    public OnTap getOntap() {
        return ontap;
    }

    public void setOntap(OnTap ontap) {
        this.ontap = ontap;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "GestureDetector(\n" +
                ontap +
                child +
                "\n)\n";
    }
}
//gestureDetector: GestureDetector OQFUNC onTap child CQFUNC COMA1 ;
