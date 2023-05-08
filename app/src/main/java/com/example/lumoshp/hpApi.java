package com.example.lumoshp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface hpApi {


    //https://lumos.benjaminwoodward.dev/  api/item/1
    @GET("api/item/{id}")
    Call<homePage> getId(@Path("id") int id);
}
