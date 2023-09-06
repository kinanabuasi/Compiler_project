package antlr.classess;

public class Number extends Expression{

    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return Integer.toString(num);
    }
}
