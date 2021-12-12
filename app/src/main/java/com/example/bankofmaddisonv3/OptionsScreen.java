package com.example.bankofmaddisonv3;

import static com.example.bankofmaddisonv3.LoginScreen.usernamesArr;

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

        // sets user textView at bottom left to username
        // implements LoginScreen class by passing in username
        TextView displayUserID = (TextView)findViewById(R.id.displayUserID_options);
        displayUserID.setText(LoginScreen.getUsername());

        // define compare button
        Button compare = findViewById(R.id.compareButton_options);
        // calls method to open compare screen
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("options", "compare pressed");
                openAfterCompare();
            }
        }); // end compare listener

        // define acc button
        Button acc = findViewById(R.id.accButton_options);
        // calls method to open acc screen
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("options", "acc pressed");
                openAfterAcc();
            }
        }); // end acc listener

        // define transfer button
        Button transfer = findViewById(R.id.transferButton_options);
        // calls method to open transfer screen
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("options", "transfer pressed");
                openAfterTransfer();
            }
        }); // end transfer listener

        // define request button
        Button request = findViewById(R.id.requestButton_options);
        // calls method to open request screen
        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("options", "request pressed");
                openAfterRequest();
            }
        }); // end request listener

    } // end onCreate

    // opens compare screen
    public void openAfterCompare()
    {
        Intent intent = new Intent(this, CompareScreen.class);
        startActivity(intent);
    }

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