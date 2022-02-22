package com.by.sir.max.weatherapp.network.weather.entity


import com.google.gson.annotations.SerializedName

data class Station(
    @SerializedName("AQI")
    val aQI: Int,
    @SerializedName("aqiInfo")
    val aqiInfo: AqiInfo,
    @SerializedName("CO")
    val cO: Double,
    @SerializedName("city")
    val city: String,
    @SerializedName("countryCode")
    val countryCode: String,
    @SerializedName("division")
    val division: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lng")
    val lng: Double,
    @SerializedName("NO2")
    val nO2: Double,
    @SerializedName("OZONE")
    val oZONE: Double,
    @SerializedName("PM10")
    val pM10: Double,
    @SerializedName("PM25")
    val pM25: Double,
    @SerializedName("placeName")
    val placeName: String,
    @SerializedName("postalCode")
    val postalCode: String,
    @SerializedName("SO2")
    val sO2: Double,
    @SerializedName("state")
    val state: String,
    @SerializedName("updatedAt")
    val updatedAt: String
) {
    override fun toString(): String {
        return "Station(" +
                "\naQI=$aQI, " +
                "\naqiInfo=$aqiInfo, " +
                "\ncO=$cO, " +
                "\ncity='$city', " +
                "\ncountryCode='$countryCode', " +
                "\ndivision='$division', " +
                "\nlat=$lat, " +
                "\nlng=$lng, " +
                "\nnO2=$nO2, " +
                "\noZONE=$oZONE, " +
                "\npM10=$pM10, " +
                "\npM25=$pM25, " +
                "\nplaceName='$placeName', " +
                "\npostalCode='$postalCode', " +
                "\nsO2=$sO2, " +
                "\nstate='$state', " +
                "\nupdatedAt='$updatedAt'" +
                "\n)"
    }
}