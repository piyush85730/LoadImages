package com.piyush.loadimagesapp.remote

import com.piyush.loadimagesapp.model.GetUnSplashApiResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ServiceAPI {

    @GET("photos")
    fun getAllPhotosData(@Query("client_id") clientId : String, @Query("per_page") perPage : Int, @Query("page") page : Int) : Call<ArrayList<GetUnSplashApiResponse>>

}