package antlr.classess;

public class Decoration {
    Border1 border;
    Label labeltext;
    HintText hinttext;

    public Border1 getBorder() {
        return border;
    }

    public void setBorder(Border1 border) {
        this.border = border;
    }

    public Label getLabeltext() {
        return labeltext;
    }

    public void setLabeltext(Label labeltext) {
        this.labeltext = labeltext;
    }

    public HintText getHinttext() {
        return hinttext;
    }

    public void setHinttext(HintText hinttext) {
        this.hinttext = hinttext;
    }

    @Override
    public String toString() {
        return "InputDecoration(\n" +
                border +
               labeltext +
                hinttext +
                "\n)\n";
    }
}
//decoration: Decoration TOWPOIT InputDecoration OQFUNC border labeltext hinttext CQFUNC;
