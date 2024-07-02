package com.example;

/**
The BankAccount class simulates a bank account.
*/

public class BankAccount
{
//fields
private double balance;      // Account balance

/**
   This constructor sets the starting balance
   at 0.0.
*/

//constructor methods used to instantiate and initialize a new object
public BankAccount()
{
   this.balance = 0.0;
}

/**
   This constructor sets the starting balance
   to the value passed as an argument.
   @param balance The starting balance.
*/

public BankAccount(double balance)
{
   this.balance = balance;
}

/**
   This constructor sets the starting balance
   to the value in the String argument.
   @param str The starting balance, as a String.
*/

public BankAccount(String str)
{
   this.balance = Double.parseDouble(str);
}

//other methods (instance or static)

/**
   The deposit method makes a deposit into
   the account.
   @param amount The amount to add to the
                 balance field.
*/

public void deposit(double amount)
{
   //balance = balance + amount;
   balance += amount;
}

/**
   The deposit method makes a deposit into
   the account.
   @param str The amount to add to the
              balance field, as a String.
*/
                     //str = "10.0"
public void deposit(String str)
{
   balance += Double.parseDouble(str);
}

/**
   The withdraw method withdraws an amount
   from the account.
   @param amount The amount to subtract from
                 the balance field.
*/

public void withdraw(double amount)
{
   balance -= amount;
}

/**
   The withdraw method withdraws an amount
   from the account.
   @param str The amount to subtract from
              the balance field, as a String.
*/

public void withdraw(String str)
{
   balance -= Double.parseDouble(str);
}

/**
   The setBalance method sets the account balance.
   @param b The value to store in the balance field.
*/

public void setBalance(double b)
{
   balance = b;
}

/**
   The setBalance method sets the account balance.
   @param str The value, as a String, to store in
              the balance field.
*/

public void setBalance(String str)
{
   balance = Double.parseDouble(str);
}

/**
   The getBalance method returns the
   account balance.
   @return The value in the balance field.
*/

public double getBalance()
{
   return balance;
}
}

