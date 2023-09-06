package antlr.classess;

public class Value {

   String  STRING, TRUE, FLASE, NULL;
   int NUMBER; double DoubleNUMBER;
    public String getSTRING() {
        return STRING;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public String getTRUE() {
        return TRUE;
    }

    public String getFLASE() {
        return FLASE;
    }

    public String getNULL() {
        return NULL;
    }

    public void setSTRING(String STRING) {
        this.STRING = STRING;
    }

    public void setNUMBER(int NUMBER) {
        this.NUMBER = NUMBER;
    }

    public void setTRUE(String TRUE) {
        this.TRUE = TRUE;
    }

    public void setFLASE(String FLASE) {
        this.FLASE = FLASE;
    }

    public void setNULL(String NULL) {
        this.NULL = NULL;
    }

    public double getDoubleNUMBER() {
        return DoubleNUMBER;
    }

    public void setDoubleNUMBER(double doubleNUMBER) {
        DoubleNUMBER = doubleNUMBER;
    }

    @Override
    public String toString() {
        if(STRING!=null){
            return STRING;
        } else if (Integer.toString(NUMBER)!=null) {
            return Integer.toString(NUMBER);
        } else if (Double.toString(DoubleNUMBER)!=null) {
            return Double.toString(DoubleNUMBER);
        } else if (TRUE!=null) {
            return TRUE;
        } else if (FLASE!=null) {
            return FLASE;
        }
        return NULL;
    }
}
