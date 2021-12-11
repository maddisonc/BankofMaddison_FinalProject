package com.example.bankofmaddisonv3;

public class User implements Comparable
{
    // 1) Initialize variables
    private String username;
    private String password;
    private double funds;

    // 2) Constructors
    public User (String username, String password, double funds)
    {
        this.username = username;
        this.password = password;
        this.funds = funds;
    } // end full constructor

    // 3) Getters
    public String getUsername ()
    {
        return username;
    }
    public String getPassword ()
    {
        return password;
    }
    public double getFunds ()
    {
        return funds;
    }

//    // 4) Setters
//    public void setUsername (String username)
//    {
//        this.username = username;
//    }
//    public void setPassword (String password)
//    {
//        this.password = password;
//    }
//    public void setFunds (double funds)
//    {
//        this.funds = funds;
//    }

    @Override
    public int compareTo(Object otherUser) {
        int output = 0;
        if (this.funds < ((User)otherUser).getFunds())
        {
            output = -1;
        }
        else if (this.funds > ((User)otherUser).getFunds())
        {
            output = 1;
        }
        return output;
    }


} // end User class

