package antlr.classess;

public class Size_Box {
    WIDTH width;
    HIEGHT hieght;

    public WIDTH getWidth() {
        return width;
    }

    public void setWidth(WIDTH width) {
        this.width = width;
    }

    public HIEGHT getHieght() {
        return hieght;
    }

    public void setHieght(HIEGHT hieght) {
        this.hieght = hieght;
    }

    @Override
    public String toString() {
        return "Size_Box(" +
                 width +
                 hieght +
                ")\n";
    }
}
