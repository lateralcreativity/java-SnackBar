package snackBarApp;

public class Customer {
    // Initialize
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    // Constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    // Getters
    public String getName()
    {
        return name;
    }
    public double getCashOnHand()
    {
        return cashOnHand;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }
    public void setCashOnHand(double cashOnHand)
    {
        this.cashOnHand = cashOnHand;
    }

    public void addCash(double cashToAdd)
    {
        cashOnHand += cashToAdd;
    }

    public void buySnack(double total)
    {
        if(cashOnHand >= total)
        {
            cashOnHand -= total;
        }
        else
        {
            System.out.println("You do not have enough money to complete this transaction.");
        }
    }
}