package antlr.classess;

public class Parameters {
Public_Types publicTyeps;
String ID;

    public Public_Types getPublicTyeps() {
        return publicTyeps;
    }

    public void setPublicTyeps(Public_Types publicTyeps) {
        this.publicTyeps = publicTyeps;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return publicTyeps+" "+ID;
    }
}
