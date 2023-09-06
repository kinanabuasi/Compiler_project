package antlr.classess;

public class Fun_Def {

    Void_Function voidFunction;
    Type_Function typeFunction;

    public Void_Function getVoidFunction() {
        return voidFunction;
    }

    public void setVoidFunction(Void_Function voidFunction) {
        this.voidFunction = voidFunction;
    }

    public Type_Function getTypeFunction() {
        return typeFunction;
    }

    public void setTypeFunction(Type_Function typeFunction) {
        this.typeFunction = typeFunction;
    }

    @Override
    public String toString() {
        if (voidFunction!=null){
            return "Function Definition{\n" + voidFunction +"\n}\n";
        }
        else
            return "Function Definition{\n" + typeFunction +"\n}\n";
    }
}
