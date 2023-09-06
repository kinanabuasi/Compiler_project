package antlr.classess;

public class L_O_F {

    String LATE, FINAL;
    Var_or_Typr varOrType;
    List_Type listType;
    //Vars_Type type;
    VarsWithType lineWithType;

    public String getLATE() {
        return LATE;
    }

    public String getFINAL() {
        return FINAL;
    }

    public Var_or_Typr getVarOrType() {
        return varOrType;
    }

    public List_Type getListType() {
        return listType;
    }

   // public Vars_Type getType() {
//        return type;
//    }

    public VarsWithType getLineWithType() {
        return lineWithType;
    }


    public void setLATE(String LATE) {
        this.LATE = LATE;
    }

    public void setFINAL(String FINAL) {
        this.FINAL = FINAL;
    }

    public void setVarOrType(Var_or_Typr varOrType) {
        this.varOrType = varOrType;
    }

    public void setListType(List_Type listType) {
        this.listType = listType;
    }

//    public void setType(Vars_Type type) {
//        this.type = type;
//    }

    public void setLineWithType(VarsWithType lineWithType) {
        this.lineWithType = lineWithType;
    }

    @Override
    public String toString() {
        if(LATE!=null&&varOrType!=null)
        {
            return "\n{ "+LATE+" "+ varOrType+ "}"+"\n";
        }

        else if (LATE!=null&&listType!=null)
        {
            return "\n{"+LATE+" "+listType+ "}"+"\n";
        }
        else if (LATE==null)
        {
            if(varOrType!=null)
                return "\n{ " +varOrType+" }\n";
            else if (listType!=null)
                return "\n{ "+listType+" }\n";
        } else if (FINAL!=null&&lineWithType!=null)
        {
            return "\n{ "+FINAL+" "+lineWithType+" }"+"\n";
        } else if (FINAL!=null&&listType!=null)
        {
            return "\n{ "+FINAL+" "+listType+" }"+"\n";
        } else if (FINAL==null)
        {
            if(lineWithType!=null)
                return "\n{ "+lineWithType+" }"+"\n";
            else if (listType!=null)
                return "\n{ "+listType+" }"+"\n";
        }else if (LATE!=null&&FINAL!=null&&lineWithType!=null)
        {
            return "\n{ "+LATE+" "+FINAL+" "+lineWithType+" }"+"\n";
        }else if (LATE!=null&&FINAL!=null&&listType!=null)
        {
            return "\n{ "+LATE+" "+FINAL+" "+listType+" }"+"\n";
        }else if (LATE==null&&FINAL==null&&lineWithType!=null)
        {
            return "\n{ "+lineWithType+" }"+"\n";
        }
        else if (LATE==null&&FINAL==null&&listType!=null)
        {
            return "\n{ "+listType+" }"+"\n";
        }
        //else if (LATE==null&&FINAL==null&&listType!=null)  هاد الشرط النهائي رح يرجع هي في حال اختل كلشسي قبلو
            return "\n{"+varOrType+" }"+"\n";

    }
}
