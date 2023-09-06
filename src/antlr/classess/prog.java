package antlr.classess;

import antlr.AST.AST_Tree;
import antlr.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class prog {

     List<Library_Def> imports_list=new ArrayList<Library_Def>();
     public List<Library_Def> get_imports_list() {
          return imports_list;
     }
     Node node;

     public Node getNode() {
          return node;
     }

     public void setNode(Node node) {
          this.node = node;
     }

     public void set_imports_list(List<Library_Def> imports_list) {
          this.imports_list = imports_list;
     }

     List<Class_Def> class_list = new ArrayList<Class_Def>();

     public List<Class_Def> get_class_list() {
          return class_list;
     }

     public void set_class_list(List<Class_Def> class_list) {
          this.class_list = class_list;
     }

     @Override
     public String toString() {
          if (imports_list != null) {
               return "\n Program Contain a {" +
                       "\nimports [ " + imports_list + " ]" +
                       "\nclasess [" + class_list + " ]"
                       + "}";
          }
          else
               return "\n Program Contain a {" +
                       "\nclasess [" + class_list + " ]"
                       + "}";
     }
}
