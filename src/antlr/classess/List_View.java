package antlr.classess;

public class List_View {
    ItemCount itemCount;
    ItemBuilder itemBuilder;

    public ItemCount getItemCount() {
        return itemCount;
    }

    public void setItemCount(ItemCount itemCount) {
        this.itemCount = itemCount;
    }

    public ItemBuilder getItemBuilder() {
        return itemBuilder;
    }

    public void setItemBuilder(ItemBuilder itemBuilder) {
        this.itemBuilder = itemBuilder;
    }

    @Override
    public String toString() {
        return "\nList_View{\n" +
                itemCount +
                 itemBuilder +
                "}\n";
    }
}
//list_view: List_View DOTE Builder OQFUNC itemCount itemBuilder CQFUNC COMA1 ;
