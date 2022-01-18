package com.java;

import java.util.Scanner;

public class Cau7 {


    public static void main(String[] args) {
        System.out.println("Nhap chuoi s1: ");
        String s1 = new Scanner(System.in).nextLine();
        System.out.println("Nhap chuoi s2: ");
        String s2 = new Scanner(System.in).nextLine();

        s1.trim();
        s2.trim();

        if(!s1.contains(s2)){
            System.out.println("Chuoi "+s1+" ko chua "+s2);
        }else{
            s1 = s1.replaceAll(s2, "");
            System.out.println(s1);
        }
    }
}
