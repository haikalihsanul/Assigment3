package com.hacktiv8.assigment3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CovidTracker {
    @SerializedName("cases")
    @Expose
    public String cases;
    @SerializedName("deaths")
    @Expose
    public String deaths;
    @SerializedName("recovered")
    @Expose
    public String recovered;

    public CovidTracker(String cases, String deaths, String recovered) {
        this.cases = cases;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getCases() {
        return cases;
    }

    public String getDeaths() {
        return deaths;
    }

    public String getRecovered() {
        return recovered;
    }
}
