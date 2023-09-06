package antlr.classess;

public class Value_4 {

    String TRUE,FALSE;

    public String getTRUE() {
        return TRUE;
    }

    public void setTRUE(String TRUE) {
        this.TRUE = TRUE;
    }

    public String getFALSE() {
        return FALSE;
    }

    public void setFALSE(String FALSE) {
        this.FALSE = FALSE;
    }

    @Override
    public String toString() {
        if(TRUE!=null){
            return TRUE+"\n";
        }
        else
            return FALSE+ "\n";
    }
}
