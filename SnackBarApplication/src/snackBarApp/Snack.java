package snackBarApp;

public class Snack 
{
    // Initialize
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // Constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    // -------------- Getters -------------- 
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getCost()
    {
        return cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    // -------------- Setters -------------- 
    public void setName(String name)
    {
        this.name = name;
    }

    public void addQuantity(int amountToAdd)
    {
        this.quantity = quantity + amountToAdd;
    }

    public void buySnack(int amountToBuy)
    {
        if(amountToBuy <= quantity)
        {
            quantity = quantity - amountToBuy;
        }
        else
        {
            System.out.println("Amount to buy exceeds quantity of snack.");
        }
    }

    public double getTotal(int amountToBuy)
    {
        return cost * amountToBuy;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }
}