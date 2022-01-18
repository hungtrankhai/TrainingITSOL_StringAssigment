package com.java;


import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class Cau2 {

    static String convertString(String str){

        char[] chars = new char[str.length()];
        for (int i=0;i<str.length();i++){
             if (i%2==0) chars[i] = Character.toUpperCase(str.charAt(i));
              else chars[i] = Character.toLowerCase(str.charAt(i));
        }

        String newStr = String.valueOf(chars);
        return newStr;
    }

        public static void main (String[]args){
            System.out.println("Nhap chuoi: ");
            String string = new Scanner(System.in).nextLine();
            System.out.println(convertString(string));

        }
    }
