package antlr.classess;

public class Class_Def {

    Normal_Class normalclassDefinition;
    Flutter_Class futerrclassDefinition;

    public Normal_Class getNormalclassDefinition() {
        return normalclassDefinition;
    }

    public Flutter_Class getFuterrclassDefinition() {
        return futerrclassDefinition;
    }

    public void setNormalclassDefinition(Normal_Class normalclassDefinition) {
        this.normalclassDefinition = normalclassDefinition;
    }

    public void setFuterrclassDefinition(Flutter_Class futerrclassDefinition) {
        this.futerrclassDefinition = futerrclassDefinition;
    }

    @Override
    public String toString() {

        if(normalclassDefinition!=null) {
            return "Class_Def{\n" +
                    "Dart Class " + normalclassDefinition;    //هدول قصدي فين الكلاسات العادية يلي مادخلا بالفلتر
        }
      //  else if(futerrclassDefinition!=null)
            return   "Screen Class " + futerrclassDefinition ;



    }
}
