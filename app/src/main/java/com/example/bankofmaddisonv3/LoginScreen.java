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

        // define login button
        Button login = findViewById(R.id.loginButton);
        // calls method to open new screen
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "login btn pressed");
                openAfterLogin();
            }
        }); // end login listener
    }

    // opens options screen
    public void openAfterLogin()
    {
        Intent intent = new Intent(this, OptionsScreen.class);
        startActivity(intent);
    }


}