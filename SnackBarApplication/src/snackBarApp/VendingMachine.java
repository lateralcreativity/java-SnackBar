package snackBarApp;

public class VendingMachine 
{
    // Initialize
    private static int maxId = 0;
    private int id;
    private String name;

    // Constructor
    public VendingMachine(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    // Setters
    public void setName(String name)
    {
        this.name = name;
    }
}