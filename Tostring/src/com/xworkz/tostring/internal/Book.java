package com.xworkz.tostring.internal;

 class Book {

     String title;
     String author;
     String publisher;
     int pages;
     double price;

     Book() {
         System.out.println("no args constructor");
     }

     Book(String title, String author, String publisher, int pages, double price) {
         System.out.println("all args constructor");
         this.title = title;
         this.author = author;
         this.publisher = publisher;
         this.pages = pages;
         this.price = price;
     }

     public String toString() {
         return "Book [Title=" + title + ", Author=" + author +
                 ", Publisher=" + publisher + ", Pages=" + pages +
                 ", Price=" + price + "]";

     }

     @Override
     public boolean equals(Object obj) {
         System.out.println("running equals method");

         if (this == obj)
             return false;

         Book mov = (Book) obj;
         return false;
     }
 }


