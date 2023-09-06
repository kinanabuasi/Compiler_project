package antlr.classess;

public class SUM extends Expression{
    Expression left;
    Expression right;

    public SUM(Expression left,Expression right)
    {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+'+'+right.toString();

    }
}
