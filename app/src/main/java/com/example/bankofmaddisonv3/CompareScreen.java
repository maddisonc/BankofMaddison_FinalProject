package com.example.bankofmaddisonv3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CompareScreen extends AppCompatActivity {

    User user1 = new User(50.25);
    User user2 = new User(60.47);
    User user3 = new User(70.68);

//    // stores user's input
//    private EditText compareWithIDInput;
//
//    boolean compareValid = true;
//
//    double storeFunds = User.getFunds();
//    String fundsAsString = Double.toString(storeFunds);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compare_screen);

        // sets current user at bottom right using LoginScreen class getter
        TextView displayUserID = (TextView)findViewById(R.id.displayUserID_compare);
        displayUserID.setText(LoginScreen.getUsername());

        TextView compare1 = (TextView)findViewById(R.id.compareWithUser2Output);
        TextView compare2 = (TextView)findViewById(R.id.compareWithUser3Output);

        DecimalFormat fmt = new DecimalFormat("0.##");

        // compare user 1 funds with user 2
        if (user1.compareTo(user2) == 0)
        {
            compare1.setText("User1 has the same amount as User2.  User1 has " + fmt.format(user1.getFunds()) + ".  User2 has " + fmt.format(user2.getFunds()) + ".");
        }
        else if (user1.compareTo(user2) > 0)
        {
            compare1.setText("User1 has more funds than User2.    User1 has " + fmt.format(user1.getFunds()) + ".  User2 has " + fmt.format(user2.getFunds()) + ".");
        }
        else
        {
            compare1.setText("User1 has less funds than User2.    User1 has " + fmt.format(user1.getFunds()) + ".  User2 has " + fmt.format(user2.getFunds()) + ".");
        }

        // compare user 1 funds with user 3
        if (user1.compareTo(user3) == 0)
        {
            compare2.setText("User1 has the same amount as User3.    User1 has " + fmt.format(user1.getFunds()) + ".  User3 has " + fmt.format(user3.getFunds()) + ".");
        }
        else if (user1.compareTo(user3) > 0)
        {
            compare2.setText("User1 has more funds than User3.    User1 has " + fmt.format(user1.getFunds()) + ".  User3 has " + fmt.format(user3.getFunds()) + ".");
        }
        else
        {
            compare2.setText("User1 has less funds than User3.    User1 has " + fmt.format(user1.getFunds()) + ".  User3 has " + fmt.format(user3.getFunds()) + ".");
        }

//        // define input
//        compareWithIDInput = findViewById(R.id.userCompareIDInput);
//
//        // define compare funds button
//        Button compare = findViewById(R.id.compareFundsButton);
//
//        compare.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View view)
//            {
//                // sets users funds in textView
//                TextView displayUserFunds = (TextView)findViewById(R.id.outputUsersFunds);
//                displayUserFunds.setText(fundsAsString);
//
//                Log.i("compare", "compare funds btn pressed");
//                String compareID = compareWithIDInput.getText().toString();
//
//                if (compareID.isEmpty())
//                {
//                    Toast.makeText(CompareScreen.this, "Please enter the user's ID.", Toast.LENGTH_SHORT).show();
//                } // end if id input is empty
//                else
//                {
//                    compareValid = validateCompare(compareID);
//
//                    if (!compareValid)
//                    {
//                        Toast.makeText(CompareScreen.this, "Incorrect input.", Toast.LENGTH_SHORT).show();
//                    } // end not valid
//                } // end else fields are not empty
//
//            } // end onClick
//        }); // end listener

    } // end onCreate

//    // brain method that validates compare
//    public static boolean validateCompare (String ID)
//    {
//        boolean canCompare = false;
//
//        List<String> availableUsers = new ArrayList<>(Arrays.asList(LoginScreen.getUsernamesArr()));
//
//        // if the user inputted is found in the usernames array (now arraylist)
//        if (availableUsers.contains(ID))
//        {
//            canCompare = true;
//        } // end if ID is found in username array
//
//        return canCompare;
//    } // end validateTransfer

} // end CompareScreen class