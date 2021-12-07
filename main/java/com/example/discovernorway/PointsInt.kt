package com.example.discovernorway

import com.google.gson.annotations.SerializedName

data class PointsInt(
     @SerializedName("description")
     val description: String,
     @SerializedName("name")
     val name: String,
     @SerializedName("puntuacion")
     val puntuacion: Double,
     @SerializedName("urlImage")
     val urlImage: String

)
