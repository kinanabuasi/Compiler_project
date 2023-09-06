package antlr.classess;

public class ContainerDecoration {
    Color color;
    Border borderRadius;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Border getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(Border borderRadius) {
        this.borderRadius = borderRadius;
    }

    @Override
    public String toString() {
        return "Decoration{\n" +
                     color +
                 borderRadius +
                "\n}\n";
    }
}
//container_decoration: Decoration TOWPOIT Boxdecoration OQFUNC color borderRadius CQFUNC COMA1 ;
