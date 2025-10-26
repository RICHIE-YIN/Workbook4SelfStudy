package com.pluralsight.PhaseTwo_ClassRelationships.CoffeeShopDrinkCustomer;

public class CoffeeShopProgram {
    public static void main(String[] args) {
        Drink latte = new Drink("Latte", 4);
        Drink espresso = new Drink("Espresso", 2);
        Drink frappe = new Drink("Frappe", 6);

        Customer cus1 = new Customer("Bob");
        Customer cus2 = new Customer("Alice");
        Customer cus3 = new Customer("Kayla");

        cus1.addDrink(latte);
        cus2.addDrink(latte);
        cus2.addDrink(espresso);
        cus3.addDrink(latte);
        cus3.addDrink(espresso);
        cus3.addDrink(frappe);

        CoffeeShop shop1 = new CoffeeShop("Richie's coffee shop");
        shop1.addCustomer(cus1);
        CoffeeShop shop2 = new CoffeeShop("Trey's coffee shop");
        shop2.addCustomer(cus2);
        CoffeeShop shop3 = new CoffeeShop("Jus's coffee shop");
        shop3.addCustomer(cus3);

        shop1.calculateTotalSales();
        shop2.calculateTotalSales();
        shop3.calculateTotalSales();

        shop1.findMostExpensiveDrink();
        shop2.findMostExpensiveDrink();
        shop3.findMostExpensiveDrink();
    }
}
