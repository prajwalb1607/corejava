package com.xworkz.tostring.external;

import com.xworkz.tostring.internal.Product;

 class Laptop extends Product {

   protected Laptop() {
        super();
    }

  protected Laptop(int id, String name, String category, double price, int quantity) {
        super(id, name, category, price, quantity);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        System.out.println(laptop.toString());

        Laptop laptop1 = new Laptop(101, "Dell XPS", "Laptop", 85000, 5);
        System.out.println(laptop1.toString());
        System.out.println(laptop=laptop1);
        System.out.println(laptop.equals(laptop));
    }
}

