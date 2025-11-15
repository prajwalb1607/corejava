package com.xworkz.tostring.internal;

 public class Product {

        protected int id;
        protected String name;
        protected String category;
        protected double price;
        protected int quantity;

        protected Product() {
            System.out.println("no args constructor");
        }

        protected Product(int id, String name, String category, double price, int quantity) {
            System.out.println("all args constructor");
            this.id = id;
            this.name = name;
            this.category = category;
            this.price = price;
            this.quantity = quantity;
        }

        public String toString() {
            return "Product [ID=" + id + ", Name=" + name +
                    ", Category=" + category + ", Price=" + price +
                    ", Quantity=" + quantity + "]";
        }

     @Override
     public boolean equals(Object obj) {
         System.out.println("running equals method");


         if (this==obj)
         return true;



         Product other=(Product) obj;
         return  false;

     }
 }


