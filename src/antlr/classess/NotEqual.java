package antlr.classess;

public class NotEqual extends Expression{
    Expression left;
    Expression right;

    public NotEqual(Expression left,Expression right) {

        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+"!="+right.toString();
    }
}
