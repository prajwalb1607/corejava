package com.xworkz.packages.external;

import com.xworkz.packages.internal.Football;

public class Isl extends Football {
    public void league(){
        System.out.println("isl is a indian super league");
    }
    public static void main(String [] args){
        Isl f=new Isl();
        f.squad();
        f.show();
        f.league();
        Rcb i=new Rcb();
        i.display();
        i.team();

    }
}
