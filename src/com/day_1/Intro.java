package com.day_1;

public class Intro {

    public static void main(String[] args) {
	String pN = "      Hola IronHackers ";
	String date = "11/1/2021";
        System.out.println(pN + date);
        System.out.println(productFormatter(pN, date));

    }

    public static String productFormatter(String productName, String date){
        return productName.trim().toUpperCase().replace(' ', '_').concat(" ").concat(date);
    }
}
