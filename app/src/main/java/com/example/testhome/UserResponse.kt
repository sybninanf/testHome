package com.example.testhome

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @field:SerializedName("job")
    val job_title: String,

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("work")
    val workplace: String
)