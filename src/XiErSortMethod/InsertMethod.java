package XiErSortMethod;

public class InsertMethod {
    public static void main(String[] args) {
        int[] arr = {25,11,45,26,12,78};
insertMethod(arr);
    }
    @SuppressWarnings("Duplicates")
    public static void insertMethod(int[] arr){
        int len = arr.length;
        for(int i = 0;i<len-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    arr[j] = arr[j] ^ arr[j-1];
                    arr[j-1] = arr[j] ^ arr[j-1];
                    arr[j] = arr[j] ^ arr[j-1];

                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
