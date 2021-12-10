package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {
    // array of usernames
    String usernames[] = {"user1", "user2", "user3"};

    // array of passwords
    String passwords[] = {"ps1", "ps2", "ps3"};

    // boolean that holds whether or not username correlates with password in arrays
    boolean loginIsValid = false;

    // stores user's input
    private static EditText usernameInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // define inputs
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);

        // define login button
        Button login = findViewById(R.id.loginButton);

        // calls method to open new screen
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Bank", "login btn pressed");
                String inputUser = usernameInput.getText().toString();
                String inputPass = passwordInput.getText().toString();

                if (inputUser.isEmpty() || inputPass.isEmpty())
                {
                    Toast.makeText(LoginScreen.this, "Please enter your login details.", Toast.LENGTH_SHORT).show();
                } // end if username input and password input are empty
                else
                {
                    loginIsValid = validateLogin(inputUser, inputPass); // boolean for valid credentials

                    if (!loginIsValid)
                    {
                        Toast.makeText(LoginScreen.this, "Incorrect login", Toast.LENGTH_SHORT).show();
                    } // end if wrong login

                    else
                    {
                        openAfterLogin();
                    } // else login was correct

                } // end else if

            } // end login button pressed

        }); // end login listener

    } // end onCreate

    // getters
    public static String getUser()
    {
        String username = usernameInput.toString();
        return username;
    }

    public String getPass()
    {
        return passwordInput.toString();
    }

    // brain that validates login (if user correlates with password in arrays)
    private boolean validateLogin (String user, String pass)
    {
        if (user.equals(usernames[0]) && pass.equals(passwords[0]))
        {
            return true;
        }
        return false;
    } // end login validator

    // opens options screen
    public void openAfterLogin()
    {
        Intent intent = new Intent(this, OptionsScreen.class);
        startActivity(intent);
    } // end open new screen

} // end LoginScreen class
