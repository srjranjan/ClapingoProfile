package com.srj.clapingoprofile


import com.google.gson.annotations.SerializedName

data class BookedTimings(
    @SerializedName("Friday")
    val friday: List<String>,
    @SerializedName("Monday")
    val monday: List<Any>,
    @SerializedName("Saturday")
    val saturday: List<Any>,
    @SerializedName("Sunday")
    val sunday: List<Any>,
    @SerializedName("Thursday")
    val thursday: List<String>,
    @SerializedName("Tuesday")
    val tuesday: List<Any>,
    @SerializedName("Wednesday")
    val wednesday: List<Any>
)