package antlr.classess;

public class MULT extends Expression {
    Expression left;
    Expression right;

    public MULT(Expression left,Expression right)
    {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+'*'+right.toString();

    }
}
