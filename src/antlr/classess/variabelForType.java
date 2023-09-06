package antlr.classess;

public class variabelForType {
    String INT_TYPE ,ID,STRING_TYPE,Double_TYPE,BOOL_TYPE;
    Value_1 value1;
    Value_2 value2;
    Value_3 value3;
    Value_4 value4;

    public String getINT_TYPE() {
        return INT_TYPE;
    }

    public void setINT_TYPE(String INT_TYPE) {
        this.INT_TYPE = INT_TYPE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSTRING_TYPE() {
        return STRING_TYPE;
    }

    public void setSTRING_TYPE(String STRING_TYPE) {
        this.STRING_TYPE = STRING_TYPE;
    }

    public String getDouble_TYPE() {
        return Double_TYPE;
    }

    public void setDouble_TYPE(String double_TYPE) {
        Double_TYPE = double_TYPE;
    }

    public String getBOOL_TYPE() {
        return BOOL_TYPE;
    }

    public void setBOOL_TYPE(String BOOL_TYPE) {
        this.BOOL_TYPE = BOOL_TYPE;
    }

    public Value_1 getValue1() {
        return value1;
    }

    public void setValue1(Value_1 value1) {
        this.value1 = value1;
    }

    public Value_2 getValue2() {
        return value2;
    }

    public void setValue2(Value_2 value2) {
        this.value2 = value2;
    }

    public Value_3 getValue3() {
        return value3;
    }

    public void setValue3(Value_3 value3) {
        this.value3 = value3;
    }

    public Value_4 getValue4() {
        return value4;
    }

    public void setValue4(Value_4 value4l) {
        this.value4 = value4l;
    }


    @Override
    public String toString() {
        if(value1!=null){
            return INT_TYPE +" "+ID+"="+value1;
        }
        else if (value2!=null) {
            return STRING_TYPE +" "+ID+"="+value2;
        }else if (value3!=null) {
            return Double_TYPE +" "+ID+"="+value3;
        }

            return BOOL_TYPE +" "+ID+"="+value4;



    }
}
