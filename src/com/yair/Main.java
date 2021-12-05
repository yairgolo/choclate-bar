package com.yair;


public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 4, 7, 2, 6, 32, 765, 34, 76, 4, 87, 46, 85 , 86 ,46, 66};
        int m = 1;
        int d = 66;
        int result = Result.birthday(arr, d, m);
        System.out.println(result);
    }
}
