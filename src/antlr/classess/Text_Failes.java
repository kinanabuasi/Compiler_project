package antlr.classess;

public class Text_Failes {

    ObscureText obscureText;
    Decoration decoration;

    public ObscureText getObscureText() {
        return obscureText;
    }

    public void setObscureText(ObscureText obscureText) {
        this.obscureText = obscureText;
    }

    public Decoration getDecoration() {
        return decoration;
    }

    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    @Override
    public String toString() {
        if (obscureText!=null)
        return "\nText_Failes(" +
                 obscureText +
                 decoration +
                ")\n";
        else  return "\nText_Failes(" +
                decoration +
                ")\n";
    }
}
//text_Failed: TextField OQFUNC  obscureText decoration CQFUNC (COMA1| COMA) ;
