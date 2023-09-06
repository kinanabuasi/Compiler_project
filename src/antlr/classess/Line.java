package antlr.classess;

public class Line {

    Var_Def variabelDefinition;
    Map_Def mapDefinition;
    Fun_Def functionDefinition;
    If_Def ifDefinition;
    Expression exp;
    For_Def forDefinition;
    Print  print;

    public Var_Def getVariabelDefinition() {
        return variabelDefinition;
    }


    public Map_Def getMapDefinition() {
        return mapDefinition;
    }

    public Fun_Def getFunctionDefinition() {
        return functionDefinition;
    }

    public If_Def getIfDefinition() {
        return ifDefinition;
    }

    public Expression getExp() {
        return exp;
    }

    public For_Def getForDefinition() {
        return forDefinition;
    }

    public Print getPrint() {
        return print;
    }

    public void setVariabelDefinition(Var_Def variabelDefinition) {
        this.variabelDefinition = variabelDefinition;
    }

    public void setMapDefinition(Map_Def mapDefinition) {
        this.mapDefinition = mapDefinition;
    }

    public void setFunctionDefinition(Fun_Def functionDefinition) {
        this.functionDefinition = functionDefinition;
    }

    public void setIfDefinition(If_Def ifDefinition) {
        this.ifDefinition = ifDefinition;
    }

    public void setExp(Expression exp) {
        this.exp = exp;
    }

    public void setForDefinition(For_Def forDefinition) {
        this.forDefinition = forDefinition;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    @Override
    public String toString() {
        if(variabelDefinition!=null){
            return "\nLine{\n"  + variabelDefinition +"\n}" ;
        }
        else if(mapDefinition!=null){
            return "\nLine{\n"  + mapDefinition +"\n}" ;
        }
        else if(functionDefinition!=null){
            return "\nLine{\n"  + functionDefinition +"\n}" ;
        }
        else if(ifDefinition!=null){
            return "\nLine{\n"  + ifDefinition +"\n}" ;
        }
        else if(exp!=null){
            return "\nLine{\n"  + exp +"\n}" ;
        }
        else if(forDefinition!=null){
            return "\nLine{\n"  + forDefinition +"\n}" ;
        }
        else
           // if(print!=null){
            return "\nLine{\n"  + print +"\n}" ;
      //  }

        //return


    }
}
