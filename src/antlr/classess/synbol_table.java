package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class synbol_table {

    List<row_table> rows=new ArrayList<>();

    public List<row_table> getRows() {
        return rows;
    }

    public void setRows(List<row_table> rows) {
        this.rows = rows;
    }


    public void print() {
        String[][] Table= new String[rows.size()+1][3];
        Table[0][0]="\u001B[42m\u001B[30mType\u001B[0m";
        Table[0][1]="\u001B[42m\u001B[30mName\u001B[0m";
        Table[0][2]="\u001B[42m\u001B[30mValue\u001B[0m";
        for (int i=1;i<rows.size();i++)
        {
            Table[i][0]=rows.get(i).getType();
            Table[i][1]=rows.get(i).getName();
            Table[i][2]=rows.get(i).getValue();
        }

        for (int i=0;i<rows.size();i++)
        {
            System.out.println("----------------------------------------------------------");
            System.out.println("| "+Table[i][0]+" | "+Table[i][1]+" | "+Table[i][2]+" |");
        }
        System.out.println("----------------------------------------------------------");






        /*for(int i=0;i<rows.size();i++){
            if(rows.get(i)!=null){
                System.out.println(rows.get(i).getType()+"\t\t\t\t\t"+rows.get(i).getValue()
                +"\t\t\t\t"+rows.get(i).getName()
                );
            }
        }*/
    }





}
