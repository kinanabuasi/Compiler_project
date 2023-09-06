package antlr.classess;

public class Flutter_lines {
   AppBar appBar;
   Body body;

    public AppBar getAppBar() {
        return appBar;
    }

    public void setAppBar(AppBar appBar) {
        this.appBar = appBar;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "\nreturn Scaffold ( " +
                 appBar +
                 body +
                ")\n";
    }
}
//flutterline: RETURN Scaffold OQFUNC appBar body CQFUNC COMA ;
