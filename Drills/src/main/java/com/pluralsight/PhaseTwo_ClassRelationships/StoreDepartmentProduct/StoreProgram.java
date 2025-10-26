package com.pluralsight.PhaseTwo_ClassRelationships.StoreDepartmentProduct;

public class StoreProgram {
    public static void main(String[] args) {
        Product sourTangie = new Product(1, "Sour Tangie", 28);
        Product superBoof = new Product(2, "Super Boof", 22);
        Product whiteRuntz = new Product(3, "White Runtz", 25);
        Product GG4 = new Product(4, "GG4", 18);
        Product nineLbHammer = new Product(5, "9 Lb Hammer", 20);
        Product durbanPoison = new Product(6, "Durban Poison", 30);

        Department sativa = new Department("Sativa");
        Department indica = new Department("Indica");
        Department hybrid = new Department("Hybrid");

        sativa.addProduct(sourTangie);
        sativa.addProduct(durbanPoison);
        indica.addProduct(nineLbHammer);
        hybrid.addProduct(superBoof);
        hybrid.addProduct(whiteRuntz);
        hybrid.addProduct(GG4);

        Store zips = new Store("Zips");
        Store ikes = new Store("Ikes");
        Store k21 = new Store("K 21");

        zips.addDepartment(sativa);
        ikes.addDepartment(sativa);
        ikes.addDepartment(indica);
        k21.addDepartment(sativa);
        k21.addDepartment(indica);
        k21.addDepartment(hybrid);

        zips.listAllProducts();
        ikes.listAllProducts();
        k21.listAllProducts();

        k21.findProductByName("GG4");
    }
}
