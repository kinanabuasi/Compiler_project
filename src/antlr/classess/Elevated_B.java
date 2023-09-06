package antlr.classess;

public class Elevated_B {

    Titel titel;

    public Titel getTitel() {
        return titel;
    }

    public void setTitel(Titel titel) {
        this.titel = titel;
    }

    @Override
    public String toString() {
        if(titel==null)
        {
            return "Elevated Button(\n" +
                    "OnPressed: {} " +
                    "\n)\n";
        }
        return "Elevated Button(" +
                "OnPressed: {} " +
                titel +
                "\n)\n";
    }
}
//elevatedButton: ElevatedButton OQFUNC OnPressed OQFUNC CQFUNC OQCLASS CQCLASS COMA1 CHILD TOWPOIT title CQFUNC COMA1;
