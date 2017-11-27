
package ru.blizzed.discogsdb.model.release;

import com.google.gson.annotations.SerializedName;

public class Label {

    @SerializedName("catno")
    private String catNo;

    @SerializedName("entity_type")
    private String entityType;

    @SerializedName("id")
    private long id;

    @SerializedName("name")
    private String name;

    @SerializedName("resource_url")
    private String resourceUrl;

    public String getCatNo() {
        return catNo;
    }

    public String getEntityType() {
        return entityType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }
}
