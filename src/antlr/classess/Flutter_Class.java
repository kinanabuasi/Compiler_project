package antlr.classess;

public class Flutter_Class {
  StateFullClass statefulWidget;
  StateLessClass statelessWidget;


    public StateFullClass getStatefulWidget() {
        return statefulWidget;
    }

    public void setStatefulWidget(StateFullClass statefulWidget) {
        this.statefulWidget = statefulWidget;
    }

    public StateLessClass getStatelessWidget() {
        return statelessWidget;
    }

    public void setStatelessWidget(StateLessClass statelessWidget) {
        this.statelessWidget = statelessWidget;
    }

    @Override
    public String toString() {
        if (statefulWidget!=null)
        return "Flutter stateful Class{\n" +
                 statefulWidget +
                "\n}\n";
        else
        return "Flutter stateless Class{\n" +
                statelessWidget +
                "\n}\n";
    }
}
//statefulWidget |