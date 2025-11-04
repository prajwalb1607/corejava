package com.robot.packages.internal;

 class Satellite extends Space {
    void name() {
        System.out.println("Mission: Chandrayaan");
    }
   public static void main(String [] args){
        Satellite s=new Satellite();
        s.agency();
        s.name();

}
}
