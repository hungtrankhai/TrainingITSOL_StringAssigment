package com.java;

import java.util.Scanner;

public class Cau3 {

    static String standardString(String str){
        str=str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");    // thay the tat ca khoang trang ve 1 khoang trang
        String[] temps= str.split(" ");            // tach tung tu thanh 1 chuoi con, save vao arr

        str="";                                 // tach xong gan st thanh rong
        for(int i=0;i<temps.length;i++) {
            str+=String.valueOf(temps[i].charAt(0)).toUpperCase() + temps[i].substring(1);  // viet hoa va noi vi tri 0 voi cac vi tri con lai
            if(i<temps.length-1) // nếu temp[i] ko phai tu cuoi cung thi + them khoang trang
                str+=" ";
        }

        return str;
    }


    public static void main(String[] args) {

        System.out.println("Nhap vao chuoi chua chuan hoa: ");
        String st = new Scanner(System.in).nextLine();

        System.out.println("Chuoi da chuan hoa: ");
        System.out.println(standardString(st));
    }
}
