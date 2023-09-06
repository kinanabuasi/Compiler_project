package antlr.classess;

public class Var_or_Typr {
    String VAR,ID;
    Value value;
    VarsWithType lineWithType;

    public String getVAR() {
        return VAR;
    }

    public String getID() {
        return ID;
    }

    public Value getValue() {
        return value;
    }

    public VarsWithType getLineWithType() {
        return lineWithType;
    }

    public void setVAR(String VAR) {
        this.VAR = VAR;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public void setLineWithType(VarsWithType lineWithType) {
        this.lineWithType = lineWithType;
    }

    @Override
    public String toString() {
        if(VAR!=null&&value!=null){
            return "\n{ "+VAR+" "+ID+"="+value+"}\n";
        } else  if(VAR!=null&&value==null){
            return "\n{ "+VAR+" "+ID+"; }"+"\n";
        }else
            return "\n{ "+lineWithType+" }"+"\n";
    }
}
