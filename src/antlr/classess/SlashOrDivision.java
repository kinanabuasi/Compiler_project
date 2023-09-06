package antlr.classess;

public class SlashOrDivision extends Expression{
    Expression left;
    Expression right;

    public SlashOrDivision(Expression left,Expression right)
    {
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return left.toString()+'/'+right.toString();

    }
}
