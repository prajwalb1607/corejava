package com.xworkz.emmuration.boot;



public enum Country {

    INDIA(91, "Hindi"),
    AFGHANISTAN(93, "Pashto"),
    ALBANIA(355, "Albanian"),
    ALGERIA(213, "Arabic"),
    ANDORRA(376, "Catalan"),
    ARGENTINA(54, "Spanish"),
    AUSTRALIA(61, "English"),
    BRAZIL(55, "Portuguese"),
    CANADA(1, "English/French"),
    CHINA(86, "Mandarin");

    private int code;
    private String language;


    private Country(int code, String language) {
        this.code = code;
        this.language = language;
    }


    public int getCode() {
        return code;
    }

    public String getLanguage() {
        return language;
    }
}



