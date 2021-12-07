package com.example.bankofmaddisonv3;

public class User
{
    // 1) Initialize variables
    private String firstName;
    private String lastName;
    private String address;
    private int phone; // phone number without spaces, dashes, special characters, etc.
    private String email;

    // 2) Constructors
    public User (String firstName, String lastName, String address, int phone, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    } // end full constructor

    // 3) Getters
    public String getFirstName ()
    {
        return firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public String getAddress ()
    {
        return address;
    }

    public int getPhone ()
    {
        return phone;
    }

    public String getEmail ()
    {
        return email;
    }

    // 4) Setters
    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public void setPhone (int phone)
    {
        this.phone = phone;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

//    @Override
//    public int compareTo(Object mS) {
//        int output = 0;
//        if (this.time < ((mySong)mS).getTime())
//        {
//            output = -1;
//        }
//        else if (this.time > ((mySong)mS).getTime())
//        {
//            output = 1;
//        }
//        return output;
//    }


} // end User class

