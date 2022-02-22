package com.by.sir.max.weatherapp.network.weather.entity


import com.google.gson.annotations.SerializedName

data class AqiInfo(
    @SerializedName("category")
    val category: String,
    @SerializedName("concentration")
    val concentration: Double,
    @SerializedName("pollutant")
    val pollutant: String
) {
    override fun toString(): String {
        return "AqiInfo(" +
                "\ncategory='$category', " +
                "\nconcentration=$concentration, " +
                "\npollutant='$pollutant'" +
                "\n)"
    }
}