package antlr.classess;

public class BigOrEQUAL extends Expression{
    Expression left;
    Expression right;

    public BigOrEQUAL(Expression left,Expression right) {

        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+">="+right.toString();
    }
}
