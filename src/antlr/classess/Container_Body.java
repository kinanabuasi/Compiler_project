package antlr.classess;

public class Container_Body {

    WIDTH width;
    HIEGHT hieght;
    Padding padding;
    ContainerDecoration containerDecoration;

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

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

    public ContainerDecoration getContainerDecoration() {
        return containerDecoration;
    }

    public void setContainerDecoration(ContainerDecoration containerDecoration) {
        this.containerDecoration = containerDecoration;
    }

    @Override
    public String toString() {
        if(width!=null){
            return width.toString();
        }
        if(hieght!=null){
            return hieght.toString();
        }
        if (containerDecoration!=null){
            return containerDecoration.toString();
        }
        return padding.toString();
    }
}
//containerBody:width
//        |hieght
//        |padding
//        |container_decoration
//        ;