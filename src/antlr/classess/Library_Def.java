package antlr.classess;

import antlr.AST.Node;

public class Library_Def {

    String Import;
    URI_Class uri;
    Class_Name className;
    Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setUri(URI_Class uri){
        this.uri=uri;
    }

    public  URI_Class getUri(){
        return this.uri;
    }

    public void setClassName(  Class_Name className){
        this.className=className;
    }

    public   Class_Name getClassName(){
        return this.className;
    }

    @Override
    public String toString() {
        return "\nLibrary_Def{ " +
                "Import='" + Import + " " +
                  uri +
                  className +
                "\n}\n";
    }
}
