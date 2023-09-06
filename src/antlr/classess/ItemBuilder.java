package antlr.classess;

public class ItemBuilder {

    GestureDetector gestureDetector;

    public GestureDetector getGestureDetector() {
        return gestureDetector;
    }

    public void setGestureDetector(GestureDetector gestureDetector) {
        this.gestureDetector = gestureDetector;
    }

    @Override
    public String toString() {
        return "ItemBuilder{\n" +
                "gestureDetector= " + gestureDetector +
                "\n}\n";
    }
}
