package com.luis.newretrofit.API;

import com.luis.newretrofit.model.gitmodel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Luis on 11/17/2016.
 */

public interface gitapi {
    @GET("/users/{user}")
    //here is the other url part.best way is to start using /
    public void getFeed(@Path("user") String user, Callback<gitmodel> response);
    //string user is for passing values from edittext for eg: user=basil2style,google
    //response is the response from the server which is now in the POJO
}