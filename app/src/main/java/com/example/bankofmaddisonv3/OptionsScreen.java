package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OptionsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_screen);

        // sets user textbox at bottom left to username
        // implements LoginScreen class by passing in username
        TextView displayUserID = (TextView)findViewById(R.id.displayUserID);
        displayUserID.setText(LoginScreen.getUsername());


        // define acc button
        Button acc = findViewById(R.id.accButton);
        // calls method to open acc screen
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "acc pressed");
                openAfterAcc();
            }
        }); // end acc listener

        // define transfer button
        Button transfer = findViewById(R.id.transferButton);
        // calls method to open acc screen
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "transfer pressed");
                openAfterTransfer();
            }
        }); // end transfer listener

        // define request button
        Button rq = findViewById(R.id.requestButton);
        // calls method to open acc screen
        rq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "rq pressed");
                openAfterRequest();
            }
        }); // end request listener

    } // end onCreate

    // opens acc screen
    public void openAfterAcc()
    {
        Intent intent = new Intent(this, AccountScreen.class);
        startActivity(intent);
    }

    // opens transfer screen
    public void openAfterTransfer()
    {
        Intent intent = new Intent(this, TransferScreen.class);
        startActivity(intent);
    }

    // opens request screen
    public void openAfterRequest()
    {
        Intent intent = new Intent(this, RequestScreen.class);
        startActivity(intent);
    }

}