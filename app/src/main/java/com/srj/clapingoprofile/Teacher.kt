package com.srj.clapingoprofile


import com.google.gson.annotations.SerializedName

data class Teacher(
    @SerializedName("description")
    val description: String, // Hi there! I'm a Java software developer and an Android Engineer. Also, Ican develop backend using NodeJS. Apart from this, I have an excellent grasp in the designfield also from UI/UX, Wireframing, prototyping and video editing. My strength is devoted tohard work, self-motivation and my work.
    @SerializedName("_id")
    val id: String, // 6141ca763a648704b9399029
    @SerializedName("image")
    val image: String, // https://clapngobucket.s3.amazonaws.com/Images/1643833854632.png
    @SerializedName("isYoutubeConsentSigned")
    val isYoutubeConsentSigned: Boolean, // false
    @SerializedName("name")
    val name: String // Rishabh Jain
)