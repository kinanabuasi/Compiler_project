package antlr.classess;

public class ItemCount {
    String ID,Length;
    int num;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if(ID!=null&&Length!=null){
            return "\nitem count: "+ID+"."+Length+"\n";
        }
        return "\nitem count: " +num+
                "\n";
    }
}
