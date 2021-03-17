package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    //initializes parse sdk as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
       ParseObject.registerSubclass(Post.class);
       Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KgCya97hRpQM0KscsUPJvTLpI0X90ajmBeDIU4hy")
                .clientKey("OVpAdoytPbgVcnM7HhcuSUqTfdJMvyServyul32x")
                .server("https://parseapi.back4app.com")
                .build()
        );

//<meta-data
//            android:name="com.parse.SERVER_URL"
//            android:value="https://parseapi.back4app.com/" />
//        <meta-data
//            android:name="com.parse.APPLICATION_ID"
//            android:value="KgCya97hRpQM0KscsUPJvTLpI0X90ajmBeDIU4hy" />
//        <meta-data
//            android:name="com.parse.CLIENT_KEY"
//            android:value="OVpAdoytPbgVcnM7HhcuSUqTfdJMvyServyul32x" />

    }
}
