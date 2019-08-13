package ru.blizzed.discogsdb.model.user;

import com.google.gson.annotations.SerializedName;

public class CollectionValue {

    @SerializedName("maximum")
    private String max;
    @SerializedName("median")
    private String median;
    @SerializedName("minimum")
    private String min;

    public CollectionValue() {
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMedian() {
        return median;
    }

    public void setMedian(String median) {
        this.median = median;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

}
