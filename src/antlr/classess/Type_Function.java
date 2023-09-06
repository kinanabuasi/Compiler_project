package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Type_Function {
    String ID,INT_TYPE,STRING_TYPE,BOOL_TYPE,Double_TYPE,RETURN;
    List<Parameters> parameters1=new ArrayList<>();
    List<Line> statements1=new ArrayList<>();

   Value_1 integerValue;

    Value_2 stringValue;
    Value_3 doubleValue;
    Value_4 boolValue;

    public String getINT_TYPE() {
        return INT_TYPE;
    }

    public void setINT_TYPE(String INT_TYPE) {
        this.INT_TYPE = INT_TYPE;
    }

    public String getSTRING_TYPE() {
        return STRING_TYPE;
    }

    public void setSTRING_TYPE(String STRING_TYPE) {
        this.STRING_TYPE = STRING_TYPE;
    }

    public String getBOOL_TYPE() {
        return BOOL_TYPE;
    }

    public void setBOOL_TYPE(String BOOL_TYPE) {
        this.BOOL_TYPE = BOOL_TYPE;
    }

    public String getDouble_TYPE() {
        return Double_TYPE;
    }

    public void setDouble_TYPE(String double_TYPE) {
        Double_TYPE = double_TYPE;
    }

    public List<Parameters> getParameters1() {
        return parameters1;
    }

    public void setParameters1(List<Parameters> parameters1) {
        this.parameters1 = parameters1;
    }

    public List<Line> getStatements1() {
        return statements1;
    }

    public void setStatements1(List<Line> statements1) {
        this.statements1 = statements1;
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public Value_1 getIntegerValue() {
        return integerValue;
    }

    public void setIntegerValue(Value_1 integerValue) {
        this.integerValue = integerValue;
    }

    public Value_2 getStringValue() {
        return stringValue;
    }

    public void setStringValue(Value_2 stringValue) {
        this.stringValue = stringValue;
    }

    public Value_3 getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(Value_3 doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Value_4 getBoolValue() {
        return boolValue;
    }

    public void setBoolValue(Value_4 boolValue) {
        this.boolValue = boolValue;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
      if (INT_TYPE!=null){
         return  "\nInteger type function: \n"+
                 INT_TYPE+" "+ID+"("+ parameters1+" )"
                 + "{ "+statements1+"\n"+
                 RETURN+ integerValue+
                 " }";
      }else if (STRING_TYPE!=null){
          return  "\nString type function: \n"+
                  STRING_TYPE+" "+ID+"("+ parameters1+" )"
                  + "{ "+statements1+"\n"+
                  RETURN+ stringValue+
                  " }";
      }else if (Double_TYPE!=null){
          return  "Double type function: "+
                  Double_TYPE+" "+ID+"("+ parameters1+" )"
                  + "{ "+statements1+"\n"+
                  RETURN+ doubleValue+
                  " }";
      }
      else

          return  "Boolean type function: "+
                  BOOL_TYPE+" "+ID+"("+ parameters1+" )"
                  + "{ "+statements1+"\n"+
                  RETURN+ boolValue+
                  " }";


    }
}
