package Bin_SearchMethod;

public class Bin_SearchMethod {
    public static void main(String[] args) {
        int[] arr= {23,28,30,95,101,3,5,11,17,21,32,50,64,78,81};
     //int[] arr=  {3,5,11,17,21,23,28,30,32,50,64,78,81,95,101};
        MaoPao(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int index = Bin_Serach(23, arr, 0, arr.length-1);
        System.out.println(index);

    }
    //采用改进冒泡算法进行排序
    @SuppressWarnings("Duplicates")
    public static void MaoPao(int[] source){
        int len = source.length-1;
        boolean flag = false;
        int lastIndex  = 0;
        for(int i = 0 ; i< source.length;i++){
            for(int j = 0 ; j < len;j++ ){
                if(source[j] > source[j+1]){
                    source[j] =source[j] ^ source[j+1];
                    source[j+1] =source[j] ^ source[j+1];
                    source[j] =source[j] ^ source[j+1];
                    flag = false;
                    lastIndex =j;
                }
            }
            len = lastIndex;
            if(flag){
                break;
            }
        }
    }

    public static int Bin_Serach(int data,int[] arr,int left,int right){

        int mid = (right-left)/2+left;
        if(arr[mid] == data ){
            return mid;
        }
        if(left >=right){
            return -1;
        }
          if(arr[mid] > data){
             right = mid-1;
            return Bin_Serach(data,arr,left,right);
          }else if(arr[mid] < data){
              left = mid+1;
            return   Bin_Serach(data,arr,left,right);
          }
        return  -1;
    }
}
