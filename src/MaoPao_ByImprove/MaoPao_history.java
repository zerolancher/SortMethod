package MaoPao_ByImprove;

import Maopao_Method.Maopao_method;

public class MaoPao_history {
    public static void main(String[] args) {
        int[] arr = new int[]{5,8,6,3,9,2,1,7};
       // MaoPao_sort(arr);
      //  MaoPao_sortImprove_01(arr);
        Mao_PaoImprove_02(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    private static void MaoPao_sort(int[] arr){    //传统冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for(int j= 0 ; j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                }
            }
        }
    }
    private static void MaoPao_sortImprove_01(int[] arr){
        boolean flag = true;
        for(int i = 0 ;i < arr.length;i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }
    @SuppressWarnings("Duplicates")
    private static void Mao_PaoImprove_02(int[] arr){
        boolean flag = true;
        int index  = arr.length-1;
        int lastIndex = 0;
        for(int i= 0;i<arr.length;i++){
            for(int j = 0 ; j <index;j++){
                if(arr[j] > arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                    flag = false;
                    lastIndex = j;
                }
            }
            index = lastIndex;
            if(flag){
                break;
            }
        }
    }
}
