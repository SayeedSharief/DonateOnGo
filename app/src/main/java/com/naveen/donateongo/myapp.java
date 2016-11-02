package com.naveen.donateongo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;


/**
 * Created by lenovo on 29-10-2016.
 */

public class myapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
       /* Parse.enableLocalDatastore(this);

       Parse.initialize(this);

        final ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MYXg4Q49PsQV6P4AomRsMTiV6NXLdHRd7Obsp54L") // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("http://localhost:1337/parse/").build());*/

        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("MYXg4Q49PsQV6P4AomRsMTiV6NXLdHRd7Obsp54L")
                .clientKey("6lbIxX7Y5LKipaptKRgYjy0lnnjgH7oTlCi8k8rh")
                .server("http://localhost:1337/parse/")   // '/' important after 'parse'
                .build());

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();


    }
}
