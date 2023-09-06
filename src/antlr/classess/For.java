package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class For {
    String FOR="for",BoM,BLUSBLUS, MINUSMINUS;
    variabelForType valueType;
    Condition condition;
    List<Line> statements3=new ArrayList<>();

    public String getFOR() {
        return FOR;
    }

    public String getBoM() {
        return BoM;
    }

    public String getBLUSBLUS() {
        return BLUSBLUS;
    }

    public String getMINUSMINUS() {
        return MINUSMINUS;
    }

    public variabelForType getValueType() {
        return valueType;
    }

    public Condition getCondition() {
        return condition;
    }

    public List<Line> getStatements3() {
        return statements3;
    }

    public void setFOR(String FOR) {
        this.FOR = FOR;
    }

    public void setBoM(String boM) {
        BoM = boM;
    }

    public void setBLUSBLUS(String BLUSBLUS) {
        this.BLUSBLUS = BLUSBLUS;
    }

    public void setMINUSMINUS(String MINUSMINUS) {
        this.MINUSMINUS = MINUSMINUS;
    }

    public void setValueType(variabelForType valueType) {
        this.valueType = valueType;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public void setStatements3(List<Line> statements3) {
        this.statements3 = statements3;
    }

    @Override
    public String toString() {

        if (BLUSBLUS!=null){
            BoM=BLUSBLUS;
        }else BoM=MINUSMINUS;

        return FOR+ "( "+valueType.toString()+";"
                +condition.toString()+";"+valueType.ID+BoM+")"+
                "{"+statements3+"}\n";
    }
}
//for: FOR OQFUNC INT_TYPE ID EQUAL NUMBER COMA ID
//        (EqualEqual| QcOrBig|QoOrSmal|NotEqual)
//        NUMBER COMA ID (BLUSBLUS| MINUSMINUS)CQFUNC OQCLASS (line)* CQCLASS;
