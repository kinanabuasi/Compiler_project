package antlr.classess;

public class SmalOrEQUAL extends Expression{
    Expression left;
    Expression right;

    public SmalOrEQUAL(Expression left,Expression right) {

        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return
                left.toString()+"<="+right.toString();
    }
}
