package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AccountScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_screen);

        //
        TextView userDisplay = (TextView)findViewById(R.id.displayUser);
        userDisplay.setText(LoginScreen.getUser());
    }
}
