package antlr.classess;

import antlr.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class List_Type {

    String LIST,ID,INT_TYPE="int",STRING_TYPE="String",Double_TYPE="double",BOOL_TYPE="bool";

    List<Value_1> value1=new ArrayList<>();
    List<Value_2> value2=new ArrayList<>();
    List<Value_3> value3=new ArrayList<>();
    List<Value_4> value4=new ArrayList<>();
    Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public String getLIST() {
        return LIST;
    }

    public void setLIST(String LIST) {
        this.LIST = LIST;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getINT_TYPE() {
        return INT_TYPE;
    }

    public void setINT_TYPE(String INT_TYPE) {
        this.INT_TYPE = INT_TYPE;
    }

    public String getSTRING_TYPE() {
        return STRING_TYPE;
    }

    public void setSTRING_TYPE(String STRING_TYPE) {
        this.STRING_TYPE = STRING_TYPE;
    }

    public String getDouble_TYPE() {
        return Double_TYPE;
    }

    public void setDouble_TYPE(String double_TYPE) {
        Double_TYPE = double_TYPE;
    }

    public String getBOOL_TYPE() {
        return BOOL_TYPE;
    }

    public void setBOOL_TYPE(String BOOL_TYPE) {
        this.BOOL_TYPE = BOOL_TYPE;
    }

    public List<Value_1> getValue1() {
        return value1;
    }

    public void setValue1(List<Value_1> value1) {
        this.value1 = value1;
    }

    public List<Value_2> getValue2() {
        return value2;
    }

    public void setValue2(List<Value_2> value2) {
        this.value2 = value2;
    }

    public List<Value_3> getValue3() {
        return value3;
    }

    public void setValue3(List<Value_3> value3) {
        this.value3 = value3;
    }

    public List<Value_4> getValue4() {
        return value4;
    }

    public void setValue4(List<Value_4> value4) {
        this.value4 = value4;
    }


    @Override
    public String toString() {
    if(INT_TYPE!=null&& value1!=null){
        return "\nList<"+INT_TYPE+"> "+ID+" =["+value1+","+"]\n";
    } else if (INT_TYPE!=null) {
        return "\nList<"+INT_TYPE+"> "+ID+"\n";
    }else   if(STRING_TYPE!=null&& value2!=null){
        return "\nList<"+STRING_TYPE+"> "+ID+" =["+value2+","+"]\n";
    } else if (STRING_TYPE!=null) {
        return "\nList<"+STRING_TYPE+"> "+ID+"\n";
    }else   if(Double_TYPE!=null&& value3!=null){
        return "\nList<"+Double_TYPE+"> "+ID+" =["+value3+","+"]\n";
    } else if (Double_TYPE!=null) {
        return "\nList<"+Double_TYPE+"> "+ID+"\n";
    }else   if(BOOL_TYPE!=null&& value4!=null){
        return "\nList<"+BOOL_TYPE+"> "+ID+" =["+value4+","+"]\n";
    }
    //else if (BOOL_TYPE!=null)
        return "\nList<"+BOOL_TYPE+"> "+ID+"\n";

    }
}
//    INT_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST value1 CLOSE_ARCH_LIST)? COMA
//        | LIST QoOrSmal STRING_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST value2 CLOSE_ARCH_LIST)? COMA
//        | LIST QoOrSmal Double_TYPE QcOrBig ID (EQUAL OPEN_ARCH_LIST value3 CLOSE_ARCH_LIST)? COMA
//        | LIST QoOrSmal BOOL_TYPE