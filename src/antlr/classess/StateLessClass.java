package antlr.classess;

public class StateLessClass {

    String ABSTRACT,ID,EXTENDES,StatelessWidget;
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
        return StatelessWidget;
    }

    public void setStatelessWidget(String statefulWidget) {
        StatelessWidget = statefulWidget;
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
            return ABSTRACT+"class "+ID+ " "+EXTENDES+ " "+StatelessWidget
                    +"{\n"+buildScreen+"}";
        }
        else
            return "class "+ID+ " "+EXTENDES+ " "+StatelessWidget
                    +"{\n"+buildScreen+"}";
    }


}
