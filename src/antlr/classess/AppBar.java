package antlr.classess;

public class AppBar {

    Titel title;



    public Titel getTitle() {
        return title;
    }

    public void setTitle(Titel title) {
        this.title = title;
    }

    @Override
    public String toString() {
        if (title!=null){
            return "AppBar{" +
                    title +
                    "}\n";
        }
        else
        return "AppBar{" +
            "NO Title Her"+
                "}\n";
    }
}
