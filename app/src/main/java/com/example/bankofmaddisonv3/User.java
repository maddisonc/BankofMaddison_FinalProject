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

    public User (double funds)
    {
        this.funds = funds;
    } // end funds constructor

    public User ()
    {
        this.username = "";
        this.password = "";
        this.funds = 0;
    }

    // 3) Getters
    public String getUsername ()
    {
        return username;
    }
    public String getPassword ()
    {
        return password;
    }
    public double getFunds()
    {
        return funds;
    }

    // 4) Setters
    public void setUsername (String username)
    {
        this.username = username;
    }
    public void setPassword (String password)
    {
        this.password = password;
    }
    public void setFunds (double funds)
    {
        this.funds = funds;
    }

    @Override
    // interface that compares two users' funds
    public int compareTo(Object otherUser) {
        int output = 0;
        // if current user has less, return -1
        if (this.funds < ((User)otherUser).getFunds())
        {
            output = -1;
        }
        // if current user has greater funds, return 1
        else if (this.funds > ((User)otherUser).getFunds())
        {
            output = 1;
        }
        return output;
    } // end compareTo


} // end User class

