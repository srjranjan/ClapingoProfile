package com.srj.clapingoprofile


import com.google.gson.annotations.SerializedName

data class TeacherDetails(
    @SerializedName("bookedTimings")
    val bookedTimings: BookedTimings,
    @SerializedName("isBlocked")
    val isBlocked: Boolean, // false
    @SerializedName("rating")
    val rating: Double, // 4.6
    @SerializedName("statusCode")
    val statusCode: Int, // 200
    @SerializedName("teacher")
    val teacher: Teacher,
    @SerializedName("timeslot")
    val timeslot: Timeslot
)