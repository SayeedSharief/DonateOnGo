package com.naveen.donateongo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.parse.ParseObject;


public class MainActivity extends android.app.Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();


        final ParseObject testO = new ParseObject("Login");
       // testObject.put("foo", "bar");
        //testObject.saveInBackground();
        final Button login_but = (Button)findViewById(R.id.login_btn);
        final Button signup_but = (Button)findViewById(R.id.sign_up_btn);
        final EditText username = (EditText)findViewById(R.id.username);
        final EditText password = (EditText)findViewById(R.id.password);


        login_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getEditableText().toString();
                String pwd = password.getEditableText().toString();
                testO.add("Username",user);
                testO.addUnique("Password",pwd);

                    testO.saveInBackground();
                    Toast.makeText(getApplicationContext(),"Successfull!",Toast.LENGTH_LONG).show();

            }
        });

        signup_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent reg = new Intent(MainActivity.this, RegistrationPage.class);
                startActivity(reg);
                Toast.makeText(getApplicationContext(),"Welcome!",Toast.LENGTH_LONG).show();
            }
        });
    }



}
