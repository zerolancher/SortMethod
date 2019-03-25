package GUiBIng_SortMethod;

import javax.sound.midi.MidiChannel;
import java.lang.ref.SoftReference;
import java.util.SortedMap;

public class GuiBing_ByMyself {
    public static void main(String[] args) {//分而治之的思想
      //  int[] arr = {9,8,7,6,5,4,3,2,1};
        int[] arr ={2,3,5,1,23,6,78,34,23,4,5,78,34,65,32,65,76,32,76,1,9};
        GuiBing_Method(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
    public static void GuiBing_Method(int[] arr){  //该方法用来执行归并算法
        int[] temp = new int[arr.length];
        Deal_Method(arr,temp,0,arr.length-1);

    }
    public static void Deal_Method(int[] source,int[] temp,int start,int end){
       if(start < end){
           int mid = (start+end)/2;
           Deal_Method(source,temp,start,mid);
           Deal_Method(source,temp,mid+1,end);
           merage(source,temp,start,mid,end);
       }
    }
    public static void merage(int[] source,int[] temp, int start,int mid,int end){
          int i = start;
          int j = mid+1;
          int t = 0 ;
          while (i<=mid+1&&j<=end){
              if(source[i] <= source[j]){
                  temp[t] = source[i++];
              }else {
                  temp[t] = source[j++];
              }
              t++;
          }
          while (i<=mid){
              temp[t++] = source[i++];
          }
          while (j<end){
              temp[t++] =  source[j++];
          }
          t = 0 ;
          while (start <= end){
              source[start++] = temp[t++];
          }

    }
}
