package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class Map_Def {
    String MAP,ID;
    Public_Types publicTyeps;

    Public_Types publicTyeps1;

    List<Value> listKey=new ArrayList<>();
    List<Value> listvalue=new ArrayList<>();

    public String getValue()
    {
        StringBuilder s=new StringBuilder();
        s.append("{ ");
        for(int i=0;i<listKey.size();i++)
        {
            if(i==listKey.size())
            {
                s.append(listKey.get(i).toString()+":"+listvalue.get(i).toString());
            }
            s.append(listKey.get(i).toString()+":"+listvalue.get(i).toString()+",");
        }
        s.append(" }");
        return s.toString();
    }

    public String getMAP() {
        return MAP;
    }

    public String getID() {
        return ID;
    }

    public Public_Types getPublicTyeps() {
        return publicTyeps;
    }

    public Public_Types getPublicTyeps1() {
        return publicTyeps1;
    }

    public List<Value> getListKey() {
        return listKey;
    }

    public List<Value> getListvalue() {
        return listvalue;
    }

    public void setMAP(String MAP) {
        this.MAP = MAP;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPublicTyeps(Public_Types publicTyeps) {
        this.publicTyeps = publicTyeps;
    }

    public void setPublicTyeps1(Public_Types publicTyeps1) {
        this.publicTyeps1 = publicTyeps1;
    }

    public void setListKey(List<Value> listKey) {
        this.listKey = listKey;
    }

    public void setListvalue(List<Value> listvalue) {
        this.listvalue = listvalue;
    }

    @Override
    public String toString() {
         StringBuilder p=new StringBuilder();
                 p.append("Map<").append(publicTyeps.toString()).append(",").append(publicTyeps1.toString()).append("> ")
                         .append(ID).append("= {");
                 for (int i=0;(i<listKey.size())&&(i<listvalue.size());i++)
                 {
                     p.append(listKey.get(i).toString()).append(":").append(listvalue.get(i).toString()).append(",");
                 }
                 p.append("}");
                 return p.toString();

    }
}
//    MAP QoOrSmal publicTyeps COMA1 publicTyeps QcOrBig ID EQUAL
//    OQCLASS (value TOWPOIT value (COMA1 value TOWPOIT value)*)* CQCLASS COMA;