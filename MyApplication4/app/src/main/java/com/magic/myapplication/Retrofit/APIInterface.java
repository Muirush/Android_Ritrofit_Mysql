package com.magic.myapplication.Retrofit;

import com.magic.myapplication.Models.userModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIInterface {
    @FormUrlEncoded
    @POST("login.php")
    Call<userModel> loginUser(@Field("phone") String phone,
                              @Field("password") String password);
}
