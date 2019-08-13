package ru.blizzed.discogsdb.model.user;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Field {

    @SerializedName("name")
    private String name;
    @SerializedName("lines")
    private int lines;
    @SerializedName("options")
    private List<String> options;
    @SerializedName("id")
    private long id;
    @SerializedName("position")
    private int position;
    @SerializedName("type")
    private String type;
    @SerializedName("public")
    private boolean isPublic;

    public Field() {
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

}
