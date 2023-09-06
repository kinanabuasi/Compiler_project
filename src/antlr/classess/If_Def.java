package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class If_Def {
  String IF;
    Condition condition;
  List<Line> statements2=new ArrayList<>();

    public String getIF() {
        return IF;
    }

    public void setIF(String IF) {
        this.IF = IF;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public List<Line> getStatements2() {
        return statements2;
    }

    public void setStatements2(List<Line> statements2) {
        this.statements2 = statements2;
    }

    @Override
    public String toString() {
        return "\n"+
                IF+"( "+condition+")\n"+
                "{"+statements2+"}\n";

    }
}
//ifDefinition: IF OQFUNC condition CQFUNC   OQCLASS (line)*  CQCLASS;
