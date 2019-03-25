package QuickSortMethod;

import SwapMethod.SwapMethod;

public class QuickSortMethod {
    public static void main(String[] args) {
      //  int[] data = {9, 3, 7, 6, 5, 1, 10, 2};
        int[] data = {6,3,4,89,45,32};
        QuickSortMethod(data,0,data.length-1);
        for (int datum : data) {
            System.out.print(datum+ " ");
        }
    }

    public static void QuickSortMethod(int[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int temp = arr[left];
        while (i!= j) {
            while (i < j && arr[j]>= temp){
                j--;
            }
            while (i < j && arr[i] <= temp){
                i++;
            }
            if(i < j){
            SwapMethod.SwapMethod(arr,i,j);
            }
        }

        int a = 0 ;
         a = arr[i];
         arr[i] = arr[left];
         arr[left] = a ;
        QuickSortMethod(arr,left,i-1);
        QuickSortMethod(arr,i+1,right);
    }
}
