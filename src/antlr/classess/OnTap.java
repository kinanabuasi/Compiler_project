package antlr.classess;

public class OnTap {
    SetState setState;

    public SetState getSetState() {
        return setState;
    }

    public void setSetState(SetState setState) {
        this.setState = setState;
    }

    @Override
    public String toString() {
        if(setState==null)
        {
            return "\nOnTap(" +

                    ")\n";
        }
        return "\nOnTap(" +
                setState +
                ")\n";
    }
}
//onTap: ONTAP OQFUNC CQFUNC OQCLASS setState CQCLASS COMA1;
