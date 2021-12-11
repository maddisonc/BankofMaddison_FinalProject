package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AccountScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_screen);

        // implements loginScreen getters
        TextView userDisplay = (TextView)findViewById(R.id.textDisplayUser);
        userDisplay.setText(LoginScreen.getUsername());

        TextView passDisplay = (TextView)findViewById(R.id.textDisplayPass);
        passDisplay.setText(LoginScreen.getPassword());
    }
}
