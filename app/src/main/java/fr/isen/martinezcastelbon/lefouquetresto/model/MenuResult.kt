package fr.isen.martinezcastelbon.lefouquetresto.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MenuResult(
    @SerializedName("data") val categories: List<Category>
) : Serializable