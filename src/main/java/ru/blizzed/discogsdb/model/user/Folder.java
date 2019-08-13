package ru.blizzed.discogsdb.model.user;

import com.google.gson.annotations.SerializedName;

public class Folder {

    @SerializedName("id")
    private int id;

    @SerializedName("count")
    private int count;

    @SerializedName("name")
    private String name;

    @SerializedName("resource_url")
    private String resourceUrl;

}
