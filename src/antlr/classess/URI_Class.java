package antlr.classess;

import java.util.ArrayList;
import java.util.List;

public class URI_Class {

    List<Folder_Names> folderName=new ArrayList<Folder_Names>();

    public void setFolderName(List<Folder_Names> folderName) {
        this.folderName = folderName;
    }

    public List<Folder_Names> getFolderName() {
        return folderName;
    }

    @Override
    public String toString() {
        return "URI_Class{" +
                "/"+ folderName +
                '}';
    }
}
