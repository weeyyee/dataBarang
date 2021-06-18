package com.informatika.databarang.network

import com.informatika.databarang.model.ResponseUserItem
import retrofit2.Call
import retrofit2.http.GET


interface ApiService {
    @GET("users")
    fun getUser(): Call<List<ResponseUserItem?>?>
}