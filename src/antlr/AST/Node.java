package antlr.AST;

public class Node {
    String Name;
    int Line_Number;
    String Type;
    String Value;
    int Child_Count;
    Node Child;
    Node Parent;
    Node Sibling;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getLine_Number() {
        return Line_Number;
    }

    public void setLine_Number(int line_Number) {
        Line_Number = line_Number;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    public int getChild_Count() {
        return Child_Count;
    }

    public void setChild_Count(int child_Count) {
        Child_Count = child_Count;
    }

    public Node getChild() {
        return Child;
    }

    public void setChild(Node child) {
        Child = child;
    }

    public Node getParent() {
        return Parent;
    }

    public void setParent(Node parent) {
        Parent = parent;
    }

    public Node getSibling() {
        return Sibling;
    }

    public void setSibling(Node sibling) {
        Sibling = sibling;
    }

    @Override
    public String toString() {
        if(getChild()!=null&&getSibling()==null)
        {
            return  getName()+" : ( Type ["+getType()+"],"+"Line Number ["+getLine_Number()+"],"+"Child Count ["+getChild_Count()+"]"+" )\n"
                    +"\n Value {\n"
                    +getValue()
                    +"\n}"
                    +"\n Child {\n"
                    +getChild().toString()
                    +"\n}"
                    +"\n]";
        }
        if(getChild()==null&&getSibling()!=null)
        {
            return  getName()+" : ( Type ["+getType()+"],"+"Line Number ["+getLine_Number()+"],"+"Child Count ["+getChild_Count()+"]"+" )\n"
                    +"\n Value {\n"
                    +getValue()
                    +"\n}"
                    +"\n Sibling {\n"
                    +getSibling().toString()
                    +"\n}"
                    +"\n]";
        }
        if (getChild()==null&&getSibling()==null)
        {
            return  getName()+" : ( Type ["+getType()+"],"+"Line Number ["+getLine_Number()+"],"+"Child Count ["+getChild_Count()+"]"+" )\n"
                    +"\n Value {\n"
                    +getValue()
                    +"\n}"
                    +"\n]";
        }

        return  getName()+" : ( Type ["+getType()+"],"+"Line Number ["+getLine_Number()+"],"+"Child Count ["+getChild_Count()+"]"+" )\n"
                +"\n Value {\n"
                +getValue()
                +"\n}"
                +"\n Child {\n"
                +getChild().toString()
                +"\n}"
                +"\n Sibling {\n"
                +getSibling().toString()
                +"\n}"
                +"\n]";
    }


}
