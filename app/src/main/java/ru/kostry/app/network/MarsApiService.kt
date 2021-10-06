package ru.kostry.app.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

//базовый-основной адрес
private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

//код для создания объекта Moshi, аналогично объекту Retrofit
private val moshi = Moshi.Builder()
//Чтобы аннотации Moshi правильно работали с Kotlin
    .add(KotlinJsonAdapterFactory())
    .build()

//создание обьекта ретрофит
private val retrofit = Retrofit.Builder()
//  добавление конвертера MoshiConverterFactory
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

object MarsApi {
    //    синглтон вызыватся в ViewModelScope, создает интерфейс
    val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java) }
}

interface MarsApiService {
    //указываем операцию Get в (добаляем конечную точку, которая будет добавлятся к базовому адресу)
//    https://android-kotlin-fun-mars-server.appspot.com/photos
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto> //suspend позволяет вызывать функцию из сопрограммы
}
