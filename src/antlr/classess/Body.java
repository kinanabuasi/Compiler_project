package antlr.classess;


public class Body {

    Row rows;
    Column columns;
    Container container;

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

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public String toString() {
        if (rows!=null){
            return " Body{\n" +rows+"\n}";
        } else  if (columns!=null){
            return " Body{\n" +columns+"\n}";
        }
        else
        return " Body{\n" +container + "\n}";
    }
}
