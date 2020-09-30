package com.example.bitirmeprojesi

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("multicamp/communities")

    suspend fun getData() : List<DataClass>

}