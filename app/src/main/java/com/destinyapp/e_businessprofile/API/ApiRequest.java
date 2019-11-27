package com.destinyapp.e_businessprofile.API;

import com.destinyapp.e_businessprofile.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiRequest {

    @FormUrlEncoded
    @POST("RumahSakit.php")
    Call<ResponseModel> ListRumahSakit(@Field("kelas") String kelas,
                                       @Field("kab_kota") String kab_kota);

    @FormUrlEncoded
    @POST("DataUser.php")
    Call<ResponseModel> DataUser(@Field("email") String email);

    @FormUrlEncoded
    @POST("AutoCheck.php")
    Call<ResponseModel> Autoverification(@Field("email") String email);

    @FormUrlEncoded
    @POST("Login.php")
    Call<ResponseModel> LoginUser(@Field("email") String email,
                                  @Field("password") String password);

    @FormUrlEncoded
    @POST("Register.php")
    Call<ResponseModel> RegisterUser(@Field("email") String email,
                                     @Field("nama") String nama,
                                     @Field("password") String password,
                                     @Field("no_telpon") String no_telpon);


}
