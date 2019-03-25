package Maopao_Method;

import SwapMethod.SwapMethod;

public class Maopao_method {
    public static void main(String[] args) {
        int[] data = {9, 3, 7, 6, 5, 1, 10, 2};
        MaoPao_Method(data);
        for (int datum : data) {
            System.out.print(datum+" ");
        }

    }
    public static void MaoPao_Method(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    SwapMethod.SwapMethod(arr,j,j+1);
                }
            }
        }
    }
}
