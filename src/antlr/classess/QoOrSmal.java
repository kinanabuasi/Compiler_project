package antlr.classess;

public class QoOrSmal extends Expression{
    Expression left;
    Expression right;

    public QoOrSmal(Expression left,Expression right) {

        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return
                left.toString()+"<"+right.toString()
                ;
    }
}
