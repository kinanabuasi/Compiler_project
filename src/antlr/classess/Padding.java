package antlr.classess;

public class Padding {

    Value_1 value1;
    Child child;

    public Value_1 getValue1() {
        return value1;
    }

    public void setValue1(Value_1 value1) {
        this.value1 = value1;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    public String toString() {
        return "\nPadding(" + value1+"\n"+
                child +
                ")\n";
    }
}
//padding: Padding OQFUNC Padding TOWPOIT EdgeInsets DOTE All OQFUNC value1 CQFUNC COMA1
//        child  CQFUNC (COMA1| COMA) ;