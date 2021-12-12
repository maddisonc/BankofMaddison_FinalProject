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
        // calls method to open acc screen
        compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "compare pressed");
                openAfterCompare();
            }
        }); // end acc listener

        // define acc button
        Button acc = findViewById(R.id.accButton_options);
        // calls method to open acc screen
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "acc pressed");
                openAfterAcc();
            }
        }); // end acc listener

        // define transfer button
        Button transfer = findViewById(R.id.transferButton_options);
        // calls method to open acc screen
        transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "transfer pressed");
                openAfterTransfer();
            }
        }); // end transfer listener

        // define request button
        Button rq = findViewById(R.id.requestButton_options);
        // calls method to open acc screen
        rq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "rq pressed");
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