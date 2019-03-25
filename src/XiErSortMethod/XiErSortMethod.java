package XiErSortMethod;

public class XiErSortMethod {
    public static void main(String[] args) {
     int[] arr ={2,3,5,1,23,6,78,34,23,4,5,78,34,65,32,65,76,32,76,1,9};
     //   int[] arr = {25,11,45,26,12,78};
        //SortMethod(arr);
        SortXiErMethod(arr);
    }

    @SuppressWarnings("Duplicates")
    private static void SortMethod(int[] arr) {
        int len = arr.length;    //增加一定的分组
        for(int i = len/2;i>=1;i = i/2){
            for(int j = 0;j < len-i;j++){
                for(int k = j+1;k > 0;k--){
                    if(arr[k]<arr[k-1]){
                        arr[k] = arr[k] ^ arr[k-1];
                        arr[k-1] = arr[k] ^ arr[k-1];
                        arr[k] = arr[k] ^ arr[k-1];
                    }
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void SortXiErMethod(int[] arr){
        int len = arr.length;
        for(int step = len/2;step>=1;step=step/2){
            for(int j = 0;j<len;j=j+step){
                for(int k = j+1; k>0&&k<len;k--){
                    if(arr[k] < arr[k-1]){
                        arr[k] = arr[k]^arr[k-1];
                        arr[k-1] =arr[k] ^ arr[k-1];
                        arr[k] = arr[k]^arr[k-1];
                    }
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
