package antlr.classess;

public class Widgets {
    Row rows;
    Column columns;
    List_View list_view;
    Container container;
    Titel   title;
    Color color;
    Padding padding_bigP;
    Text_Failes text_Failed;
    Elevated_B elevatedButton;
    Image image;
    Size_Box sizedBox;
    Expanded expanded;
    Center center;

    public Row getRows() {
        return rows;
    }

    public void setRows(Row rows) {
        this.rows = rows;
    }

    public Column getColumns() {
        return columns;
    }

    public void setColumns(Column columns) {
        this.columns = columns;
    }

    public List_View getList_view() {
        return list_view;
    }

    public void setList_view(List_View list_view) {
        this.list_view = list_view;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Titel getTitle() {
        return title;
    }

    public void setTitle(Titel title) {
        this.title = title;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Padding getpadding_bigP() {
        return padding_bigP;
    }

    public void setpadding_bigP(Padding padding) {
        this.padding_bigP = padding;
    }

    public Text_Failes getText_Failed() {
        return text_Failed;
    }

    public void setText_Failed(Text_Failes text_Failed) {
        this.text_Failed = text_Failed;
    }

    public Elevated_B getElevatedButton() {
        return elevatedButton;
    }

    public void setElevatedButton(Elevated_B elevatedButton) {
        this.elevatedButton = elevatedButton;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Size_Box getSizedBox() {
        return sizedBox;
    }

    public void setSizedBox(Size_Box sizedBox) {
        this.sizedBox = sizedBox;
    }

    public Expanded getExpanded() {
        return expanded;
    }

    public void setExpanded(Expanded expanded) {
        this.expanded = expanded;
    }

    public Padding getPadding_bigP() {
        return padding_bigP;
    }

    public void setPadding_bigP(Padding padding_bigP) {
        this.padding_bigP = padding_bigP;
    }

    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }

    @Override
    public String toString() {
        if (rows != null) {
            return "\nWidgets{" +
                    rows + "}\n";
        } else if (columns != null) {
            return "\nWidgets{" +
                    columns + "}\n";
        } else if (list_view != null) {
            return "\nWidgets{" +
                    list_view + "}\n";
        } else if (container != null) {
            return "\nWidgets{" +
                    container + "}\n";
        } else if (title != null) {
            return "\nWidget{" +
                    title + "}\n";
        } else if (color != null) {
            return "\nWidget{" +
                    color + "}\n";
        } else if (padding_bigP != null) {
            return "\nWidget{" +
                    padding_bigP + "}\n";
        } else if (text_Failed != null) {
            return "\nWidget{" +
                    text_Failed + "}\n";
        } else if (elevatedButton != null) {
            return "\nWidget{" +
                    elevatedButton + "}\n";
        } else if (image != null) {
            return "\nWidget{" +
                    image + "}\n";
        } else if (sizedBox != null) {
            return "\nWidget{" +
                    sizedBox + "}\n";
        } else if (expanded != null) {
            return "\nWidget{" +
                    expanded + "}\n";
        } else return "\nWidget{" + center + "}\n";
    }
}
//  rows
//          | columns
//          | list_view
//          |container
//          |title
//          |color
//          |padding
//          |text_Failed
//          |elevatedButton
//          |image
//          |sizedBox
//          |expanded
//          ;