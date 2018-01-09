package com.allein.freund.authapp.AuthService;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by freund on 1/9/18.
 */

public interface AuthService {
    @POST("/auth/login/")
    @FormUrlEncoded
    Call<User> sendCredentials(@Field("email") String email,
                               @Field("password") String password);
}