package com.luis.newretrofit.API;

/**
 * Created by Luis on 11/18/2016.
 */


import com.luis.newretrofit.model.arrowhcmodel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface arrowhcapi {
    @GET("/fetch/")
    public void getProduct(Callback<arrowhcmodel> response);
}
