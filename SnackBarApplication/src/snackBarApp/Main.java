package snackBarApp;

public class Main {
    private static void workWithData()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vmFood = new VendingMachine("Food");
        VendingMachine vmDrink = new VendingMachine("Drink");
        VendingMachine vmOffice = new VendingMachine("Office");

        int vmFoodId = vmFood.getId();
        Snack chips = new Snack("Chips", 36, 1.75, vmFoodId);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, vmFoodId);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, vmFoodId);

        int vmDrinkId = vmDrink.getId();
        Snack soda = new Snack("Soda", 24, 2.50, vmDrinkId);
        Snack water = new Snack("Water", 20, 2.75, vmDrinkId);

        c1.buySnack(soda.getTotal(3));
        soda.buySnack(3);
        System.out.println();
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of snack " + soda.getName() + " is " + soda.getQuantity());

        c1.buySnack(pretzel.getTotal(1));
        pretzel.buySnack(1);
        System.out.println();
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of snack " + pretzel.getName() + " is " + pretzel.getQuantity());

        c2.buySnack(soda.getTotal(2));
        soda.buySnack(2);
        System.out.println();
        System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quantity of snack " + soda.getName() + " is " + soda.getQuantity());

        c1.addCash(10.00);
        System.out.println();
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());

        c1.buySnack(chocolateBar.getTotal(1));
        chocolateBar.buySnack(1);
        System.out.println();
        System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
        System.out.println("Quantity of snack " + chocolateBar.getName() + " is " + chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println();
        System.out.println("Quantity of snack " + pretzel.getName() + " is " + pretzel.getQuantity());

        c2.buySnack(pretzel.getTotal(3));
        pretzel.buySnack(3);
        System.out.println();
        System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
        System.out.println("Quantity of snack " + pretzel.getName() + " is " + pretzel.getQuantity());
    }

    public static void main(String[] args)
    {
        workWithData();
    }
}