package antlr.classess;

public class MINUS extends Expression{
    Expression left;
    Expression right;

    public MINUS(Expression left,Expression right)
    {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+'-'+right.toString();

    }
}
