package ru.blizzed.discogsdb.model.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Folders {

    @SerializedName("folders")
    private List<Folder> folders;

    public Folders() {
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

}
