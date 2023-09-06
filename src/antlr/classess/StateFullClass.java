package antlr.classess;

public class StateFullClass {

    String ABSTRACT,ID,EXTENDES,StatefulWidget;
    BuildScreen buildScreen;

    public String getABSTRACT() {
        return ABSTRACT;
    }

    public void setABSTRACT(String ABSTRACT) {
        this.ABSTRACT = ABSTRACT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEXTENDES() {
        return EXTENDES;
    }

    public void setEXTENDES(String EXTENDES) {
        this.EXTENDES = EXTENDES;
    }

    public String getStatefulWidget() {
        return StatefulWidget;
    }

    public void setStatefulWidget(String statefulWidget) {
        StatefulWidget = statefulWidget;
    }

    public BuildScreen getBuildScreen() {
        return buildScreen;
    }

    public void setBuildScreen(BuildScreen buildScreen) {
        this.buildScreen = buildScreen;
    }

    @Override
    public String toString() {
        if(ABSTRACT!=null){
            return ABSTRACT+"class "+ID+ " "+EXTENDES+ " "+StatefulWidget
                    +"{"+buildScreen+"}";
        }
        else
            return "class "+ID+ " "+EXTENDES+ " "+StatefulWidget
                    +"{"+buildScreen+"}";
    }
}
