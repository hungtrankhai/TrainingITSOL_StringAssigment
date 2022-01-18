package com.java;

import java.util.Scanner;

public class Cau4 {


    static void standardString(String str){

        str.trim();
        str = str.replaceAll("\\s+", " ");    // thay the tat ca khoang trang ve 1 khoang trang
        String[] temps = str.split(" ");            // tach tung tu thanh 1 chuoi con, save vao arr
        String strMedial = temps[0];
        int indexOfTemp = 0;
        for(int i=0;i<temps.length;i++) {
            if (strMedial.length() < temps[i].length())  strMedial = temps[i];
            indexOfTemp = i;
        }
        System.out.println("Tu dai nhat la: "+strMedial+" | o vi tri thu "+indexOfTemp);
    }


    public static void main(String[] args) {

        System.out.println("Nhap vao chuoi: ");
        String string = new Scanner(System.in).nextLine();
        standardString(string);
    }
}
