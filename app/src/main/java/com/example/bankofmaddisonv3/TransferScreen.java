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

public class TransferScreen extends AppCompatActivity {

    // stores user's input
    private EditText fundsAmtInput;
    private EditText IDInput;

    boolean TransferValid = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_screen);

        // define inputs
        fundsAmtInput = findViewById(R.id.fundsInput);
        IDInput = findViewById(R.id.recipientIDInput);

        // define transfer button
        Button transfer = findViewById(R.id.transferFundsButton);

        transfer.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Log.i("transfer", "transfer btn pressed");
                String fundsTransferAmt = fundsAmtInput.getText().toString();
                String recipientID = IDInput.getText().toString();

                if (fundsTransferAmt.isEmpty() || recipientID.isEmpty())
                {
                    Toast.makeText(TransferScreen.this, "Please enter the funds amount and recipient ID.", Toast.LENGTH_SHORT).show();
                } // end if funds input and recipient input are empty
                else
                {
                    TransferValid = validateTransfer(fundsTransferAmt, recipientID);

                    if (!TransferValid)
                    {
                        Toast.makeText(TransferScreen.this, "Incorrect input.", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(TransferScreen.this, "Funds will be sent!", Toast.LENGTH_SHORT).show();
                    }
                } // end else fields are not empty
            } // end onClick
        }); // end listener
    } // end onCreate

    // brain method that validates transfer
    public static boolean validateTransfer (String funds, String ID)
    {
        boolean isTransferValid = false;

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
                isTransferValid = true;
            } // end if ID is found in username array
        } // if funds is not negative

        return isTransferValid;
    } // end validateTransfer

} // end TransferScreen class