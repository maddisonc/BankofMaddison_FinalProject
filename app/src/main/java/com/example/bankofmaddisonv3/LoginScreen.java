package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Wire up the button to do stuff
        // get the button
        Button login = findViewById(R.id.loginButton);
        // set what happens when user clicks
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "login btn pressed");
                openAfterLogin();
            }
        }); // end login listener
    }

    public void openAfterLogin()
    {
        Intent intent = new Intent(this, OptionsScreen.class);
        startActivity(intent);
    }


}