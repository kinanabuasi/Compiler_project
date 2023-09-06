package antlr.classess;

public class BuildScreen {

    Flutter_lines flutterline;

    public Flutter_lines getFlutterline() {
        return flutterline;
    }

    public void setFlutterline(Flutter_lines flutterline) {
        this.flutterline = flutterline;
    }

    @Override
    public String toString() {
        return "Widget Build( Build context) {\n" +
                flutterline +
                "\n}";
    }
}
