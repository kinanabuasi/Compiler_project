package antlr.classess;

public class EqualEqual extends Expression{
    Expression left;
    Expression right;

    public EqualEqual(Expression left,Expression right) {

        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+"=="+right.toString();
    }
}
