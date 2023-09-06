package antlr.classess;

public class Variablecondition extends Expression{
    String id;

    public Variablecondition(String id)
    {
        this.id=id;
    }

    @Override
    public String toString() {
        return id;
    }
}
