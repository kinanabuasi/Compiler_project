package antlr.classess;

public class Condition_Def {

    Condition condition;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return condition.toString();
    }
}
