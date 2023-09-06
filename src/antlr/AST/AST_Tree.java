package antlr.AST;


public class AST_Tree {
    Node Tree;

    public AST_Tree() {
        Tree = new Node();
    }

    public Node getTree() {
        return Tree;
    }

    public void setTree(Node tree) {
        Tree = tree;
    }

    public void Print_Ast()
    {
        System.out.println(Tree.toString());
    }
}
