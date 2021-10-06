package ru.kostry.app.network

import com.squareup.moshi.Json

//дата класс для хранения проанализированных данных Moshi
data class MarsPhoto( val id: String, @Json(name = "img_src") val imgSrcUrl: String)