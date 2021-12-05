package com.yair;


class Result {
    public static int birthday(int[] arr, int d, int m) {
        int sum = 0;
        for (int i = 0; i < arr.length - (m-1); i++) {
            for (int j = 0; j < m; j++) {
                sum += arr[i];
                i++;
            }
            i -= m;
            if (sum == d) {
                return (i);
            }
            sum = 0;
        }
        return 0;
    }
}