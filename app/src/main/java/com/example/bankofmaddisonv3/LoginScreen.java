package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    // array of usernames
    public static String usernamesArr[] = {"user1", "user2", "user3"};

    // array of passwords
    public static String passwordsArr[] = {"ps1", "ps2", "ps3"};

    // boolean that holds whether or not username correlates with password in arrays
    boolean loginIsValid = false;

    // stores username and password for getters
    public static String username;
    public static String password;

    // stores user's input
    private EditText usernameInput;
    private EditText passwordInput;

    // stores number of users
    int numUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // defines textview that will hold number of users
        TextView numUsersDisplay = (TextView)findViewById(R.id.displayUsersNum);
        // sets textview to number of users by calling method
        numUsersDisplay.setText(setNumUsers() + " ");

        // define inputs
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);

        // define login button
        Button login = findViewById(R.id.loginButton);

        // calls method to open new screen
        login.setOnClickListener(new View.OnClickListener()
        {
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
                    username = inputUser; // sets username
                    password = inputPass; // sets password

                    if (!loginIsValid)
                    {
                        Toast.makeText(LoginScreen.this, "Incorrect login", Toast.LENGTH_SHORT).show();
                    } // end if wrong login

                    else
                    {
                        openAfterLogin();
                    } // else login was correct

                } // end else not empty

            } // end login button pressed

        }); // end login listener

    } // end onCreate

    // getters
    public static String getUsername()
    {
        return username;
    }

    public static String getPassword()
    {
        return password;
    }

    public static String[] getUsernamesArr()
    {
        return usernamesArr;
    }

    public static String[] getPasswordsArr()
    {
        return passwordsArr;
    }


    // brains:

    // brain that validates login (if username correlates with password in arrays)
    public boolean validateLogin (String user, String pass)
    {
        // holds whether or not login is valid
        boolean isValid = true;

        // for length of usernames (how many users)
        for (int i = 0; i < usernamesArr.length; i++)
        {
            // if the username correlates to the password with the same index
            if (user.equals(usernamesArr[i]) && pass.equals(passwordsArr[i]))
            {
                // login is valid
                isValid = true;
                // exit for loop
                i = usernamesArr.length+1;
            } // end if
            else
            {
                isValid = false;
            } // end else username does not have corresponding password, or just invalid input
        } // end loop that lasts as long as number of usernames in array
        return isValid;
    } // end login validator

    // returns the number of users by counting number of elements in array
    public int setNumUsers ()
    {
        // holds number of users
        int userCount = 0;
        // for loops with length of usernames array
        for (int i = 0; i < usernamesArr.length; i++)
        {
            // increment count
            userCount++;
        }
        return userCount;
    }

    // opens options screen
    public void openAfterLogin()
    {
        Intent intent = new Intent(this, OptionsScreen.class);
        startActivity(intent);
    } // end open new screen

} // end LoginScreen class
