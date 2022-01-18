package com.java;

import java.util.Scanner;

public class Cau6 {

    // dung compareTo ss doi cho
    static String[] tachString(String str){
        str.trim();
        str = str.replaceAll("\\s+", " ");    // thay the tat ca khoang trang ve 1 khoang trang
        String[] temps = str.split(" ");
        return temps;
    }

static String[] sortString(String[] strings){
    for (int i = 0; i < strings.length; i++) {
        for (int j = i+1; j < strings.length; j++) {
            if(strings[i].compareTo(strings[j]) > 0){
                String temp = strings[i];
                strings[i] = strings[j];
                strings[j] = temp;
            }
        }
    }
    return strings;

}

    public static void main(String[] args) {
        System.out.println("Nhap chuoi ko qua 20 tu, moi tu ko qua 10 char: ");
        String string = new Scanner(System.in).nextLine();
        tachString(string);
        sortString(tachString(string));
    }
}
