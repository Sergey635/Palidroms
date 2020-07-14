package com.company;

public class Main {

    public static void main(String[] args) {
	String pallidrom = "И нет дорог в город тени";
	String novaya = "";
	String b = pallidrom.replaceAll(" ", "");
	String c = b.replaceAll("И", "и");

        for (int i = c.length()-1; i >=0 ; i--) {
            novaya += c.charAt(i);
        }

        System.out.println(novaya);
    }
}
