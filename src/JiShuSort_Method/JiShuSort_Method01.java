package JiShuSort_Method;

import java.util.ArrayList;
import java.util.Arrays;

public class JiShuSort_Method01 {
    public static void main(String[] args) {
        int[] arr = {9,3,5,4,9,1,2,7,8,1,3,6,5,3,4,0,10,9,9};
         int[] sortArray =  countSort(arr);
        System.out.println(Arrays.toString(sortArray));
    }

    private static int[] countSort(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];

            }
        }
        for(int i = 1 ;i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        int d = max - min;
        int[] countArray = new int[d+1];
        for(int i = 0 ; i < arr.length ; i ++){
            countArray[arr[i]-min]++;
        }

        //统计数组进行变形，后面的元素等于前面元素的和
        int sum = 0 ;
        for(int i = 0 ; i < countArray.length ;i++){
            sum += countArray[i];
            countArray[i] = sum;
        }
        int[] sortArray = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i --){
            sortArray[countArray[arr[i]-min]-1] = arr[i];
            countArray[arr[i] - min]--;
        }
        return sortArray;
    }
}
