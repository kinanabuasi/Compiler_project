package antlr.classess;

public class Var_Def {

    L_O_F leteOrFinal;

    public L_O_F getLeteOrFinal() {
        return leteOrFinal;
    }

    public void setLeteOrFinal(L_O_F leteOrFinal) {
        this.leteOrFinal = leteOrFinal;
    }

    @Override
    public String toString() {
        return "\nVar_Def{" +
               leteOrFinal +
                '}';
    }
}
