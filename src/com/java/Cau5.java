package com.java;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Cau5 {
   // ho dem ten -> ten ho dem

    static void convert(String str){

        str.trim();
        str = str.replaceAll("\\s+", " ");    // thay the tat ca khoang trang ve 1 khoang trang
        String[] temps = str.split(" ");
        int quantity = str.length();

        StringTokenizer stringTokenizer = new StringTokenizer(str);
        StringBuffer strConverted = new StringBuffer();
        String[] a = new String[quantity];
        int i = 1;

        while ((stringTokenizer.hasMoreTokens())){
            a[i] = stringTokenizer.nextToken();
            i++;
        }

        // replace chu t3 ve truoc
        strConverted.append(a[3]).append(" ");
        strConverted.append(a[1]).append(" ");
        strConverted.append(a[2]).append(" ");
        System.out.println(strConverted);
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao chuoi: ");
        String string = new Scanner(System.in).nextLine();
        convert(string);

    }
}
