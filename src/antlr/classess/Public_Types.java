package antlr.classess;

public class Public_Types {

String Double_TYPE,BOOL_TYPE,INT_TYPE,STRING_TYPE;

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

    @Override
    public String toString() {
     if (INT_TYPE!=null){
         return INT_TYPE;
     }else  if (STRING_TYPE!=null){
         return STRING_TYPE;
     }else  if (BOOL_TYPE!=null){
         return BOOL_TYPE;
     }
     return Double_TYPE;
    }
}
