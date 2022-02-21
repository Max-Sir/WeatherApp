package com.by.sir.max.weatherapp.network.entity


import com.google.gson.annotations.SerializedName

data class Weather(
    @SerializedName("message")
    val message: String,
    @SerializedName("stations")
    val stations: List<Station>
) {
    override fun toString(): String {
        return "Weather(" +
                "\nmessage='$message', " +
                "\nstations=$stations" +
                "\n)"
    }
}