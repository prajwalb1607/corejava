package com.xworkz.emmuration.boot;

public enum State {
    KARNATAKA(1828),TELAGANA(282),ANDRAPRADESH(272),TAMILNADU(172),MAHARASTRA(277);
    private int itCompany;

    private State(int itCompany) {
        this.itCompany = itCompany;
    }
    public int getItCompany(){
        return itCompany;

    }
}
