package com.xworkz.tostring.internal;

 class Movie {

     String title;
     String genre;
     String director;
     int releaseYear;
     double rating;

     Movie() {
         System.out.println("no args constructor");
     }

     Movie(String title, String genre, String director, int releaseYear, double rating) {
         System.out.println("all args constructor");
         this.title = title;
         this.genre = genre;
         this.director = director;
         this.releaseYear = releaseYear;
         this.rating = rating;
     }

     public String toString() {
         return "Movie [Title=" + title + ", Genre=" + genre + ", Director=" + director +
                 ", Year=" + releaseYear + ", Rating=" + rating + "]";
     }

     @Override
     public boolean equals(Object obj) {
         System.out.println("running equals method");

         if (this == obj)
             return false;

         Movie mov = (Movie) obj;
         return false;
     }
 }