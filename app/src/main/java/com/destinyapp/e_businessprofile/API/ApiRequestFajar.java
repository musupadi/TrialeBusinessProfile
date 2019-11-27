package com.destinyapp.e_businessprofile.API;

import com.destinyapp.e_businessprofile.Model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiRequestFajar {
    //GET
    @GET("berita")
    Call<ResponseModel> berita();

    @GET("daerah/provinsi")
    Call<ResponseModel> provinsi();

    @FormUrlEncoded
    @POST("daerah/get_kab_kota ")
    Call<ResponseModel> kota(@Field("id_provinsi") String id_provinsi);


    @FormUrlEncoded
    @POST("log")
    Call<ResponseModel> logs(@Field("id_user") String id_user,
                             @Field("id_log_menu") String id_log_menu);

    @FormUrlEncoded
    @POST("hospital/list")
    Call<ResponseModel> listHospital(@Field("kab_kota_rs") String kab_kota_rs,
                                     @Field("provinsi_rs") String provinsi_rs,
                                     @Field("nama_rs") String nama_rs,
                                     @Field("kelas_rs") String kelas_rs);
    @FormUrlEncoded
    @POST("hospital/detail")
    Call<ResponseModel> detailHospital(@Field("kode_rs") String kode_rs);

    @FormUrlEncoded
    @POST("ebook")
    Call<ResponseModel> ebook();

    @FormUrlEncoded
    @POST("user/register")
    Call<ResponseModel> register(@Field("namauser") String namauser,
                                 @Field("passworduser") String passworduser,
                                 @Field("notelponuser") String notelponuser,
                                 @Field("email_register_9928") String email_register_9928);

    @FormUrlEncoded
    @POST("user/login")
    Call<ResponseModel> login(@Field("email_user_login_998281") String email_user_login_998281,
                              @Field("password_user_8829") String password_user_8829);
}

