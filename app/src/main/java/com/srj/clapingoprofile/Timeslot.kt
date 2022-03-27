package com.srj.clapingoprofile


import com.google.gson.annotations.SerializedName

data class Timeslot(
    @SerializedName("Friday")
    val friday: List<String>,
    @SerializedName("Monday")
    val monday: List<String>,
    @SerializedName("Saturday")
    val saturday: List<String>,
    @SerializedName("Sunday")
    val sunday: List<String>,
    @SerializedName("Thursday")
    val thursday: List<String>,
    @SerializedName("Tuesday")
    val tuesday: List<String>,
    @SerializedName("Wednesday")
    val wednesday: List<Any>
)