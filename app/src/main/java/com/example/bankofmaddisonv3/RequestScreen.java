package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestScreen extends AppCompatActivity {

    // stores user's input
    private EditText requestAmtInput;
    private EditText donorIDInput;

    boolean requestValid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_screen2);

        // define inputs
        requestAmtInput = findViewById(R.id.requestAmtInput);
        donorIDInput = findViewById(R.id.donorIDInput);

        // define request button
        Button request = findViewById(R.id.requestFundsButton);

        request.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.i("request", "request btn pressed");
                String fundsRequestedAmt = requestAmtInput.getText().toString();
                String donorID = donorIDInput.getText().toString();

                if (fundsRequestedAmt.isEmpty() || donorID.isEmpty())
                {
                    Toast.makeText(RequestScreen.this, "Please enter the funds amount and donor ID.", Toast.LENGTH_SHORT).show();
                } // end if funds input and donor input are empty
                else
                {
                    requestValid = validateRequest(fundsRequestedAmt, donorID);

                    if (!requestValid)
                    {
                        Toast.makeText(RequestScreen.this, "Incorrect input.", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(RequestScreen.this, "Funds will be sent if user accepts.", Toast.LENGTH_SHORT).show();
                    }
                } // end else fields are not empty
            } // end onClick
        }); // end listener
    } // end onCreate

    // brain method that validates transfer
    public static boolean validateRequest (String funds, String ID)
    {
        boolean isRequestValid = false;

        // converts funds amount to double
        double fundsAsDouble = Double.valueOf(funds);

        // string list that holds usernames array, using arraylist instead of array to use .contains instead of sort method
        // implements LoginScreen class by passing in usernamesArr
        List<String> availableUsers = new ArrayList<>(Arrays.asList(LoginScreen.getUsernamesArr()));

        // if funds are not negative
        if (fundsAsDouble > 0)
        {
            // if the user inputted is found in the usernames array (now arraylist)
            if (availableUsers.contains(ID))
            {
                isRequestValid = true;
            } // end if ID is found in username array
        } // if funds is not negative

        return isRequestValid;
    } // end validateTransfer

} // end RequestScreen class