package com.company;

public class Main {

    private static Vending_Machine vending_machine;

    public static void main(String[] args) {

        Vending_Machine vending_machine = new Vending_Machine(10);
        vending_machine.products.add_products("chli");
        vending_machine.products.add_products("Bananana");
        vending_machine.products.add_products("Apple");
        vending_machine.products.add_products("lays");
        vending_machine.products.add_products("kurkeray");
        vending_machine.products.add_products("craeam");
        vending_machine.products.add_products("Choclate");
        vending_machine.products.add_products("wavy");
        vending_machine.products.add_products("ice cream");
        vending_machine.products.add_products("batany");
        vending_machine.products.add_products("fgd");
        vending_machine.display_menu.display(true);
        vending_machine.select_product.Selection_process();
        vending_machine.select_product.calculation();




    }
}

