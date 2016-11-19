package com.luis.newretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.luis.newretrofit.API.arrowhcapi;
import com.luis.newretrofit.API.gitapi;
import com.luis.newretrofit.model.gitmodel;
import com.luis.newretrofit.model.arrowhcmodel;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

    String API = "https://api.github.com";
    String ArrowAPI = "http://10.0.2.2:3000/products";
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void getMessage(View view) {

        tv = (TextView) findViewById(R.id.textView);
        String user = "LUIS";

        //Retrofit section start from here...
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(API).build();                                        //create an adapter for retrofit with base url

        gitapi git = restAdapter.create(gitapi.class);                            //creating a service for adapter with our GET class

        //Now ,we need to call for response
        //Retrofit using gson for JSON-POJO conversion

        git.getFeed(user,new Callback<gitmodel>() {
            @Override
            public void success(gitmodel gitmodel, Response response) {
                //we get json object from github server to our POJO or model class

                tv.setText("Github Name :"+gitmodel.getName()+"\nWebsite :"+gitmodel.getBlog()+"\nCompany Name :"+gitmodel.getCompany());

            }
            @Override
            public void failure(RetrofitError error) {
                tv.setText(error.getMessage());
            }
        });
    }


    public void getArrow(View view) {

        tv = (TextView) findViewById(R.id.textView);
        String user = "582f375d3546dc44090700aa";

        //Retrofit section start from here...
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(ArrowAPI).build();                                        //create an adapter for retrofit with base url

        arrowhcapi arrowgit = restAdapter.create(arrowhcapi.class);                            //creating a service for adapter with our GET class

        //Now ,we need to call for response
        //Retrofit using gson for JSON-POJO conversion

        arrowgit.getProduct(new Callback<arrowhcmodel>() {
            @Override
            public void success(arrowhcmodel arrowhcmodel, Response response) {
                //we get json object from github server to our POJO or model class

                tv.setText("Product Name :"+arrowhcmodel.getItemName());

            }
            @Override
            public void failure(RetrofitError error) {
                tv.setText(error.getMessage());
            }
        });
    }
}
