package JiShuSort_Method;
/**
 * @计数排序
 *
 *
 * */
public class JiShuSort_Method {
    public static void main(String[] args) {
        int[] arr = {9,3,5,4,9,1,2,7,8,1,3,6,5,3,4,0,10,9,9};
        JishuMethod(arr);
    }
    //基数排序初版
    private static void JishuMethod(int[] arr) {
        //先得到整个数组的最大值
        int max = arr[0];
        for(int i = 1 ; i < arr.length;i++){
             if(max < arr[i]){
                 max = arr[i];
             }
        }
        int[] countArray = new int[max+1];
        for(int i = 0 ;i < arr.length;i++){
            countArray[arr[i]]++;
        }
        for(int j = 0 ; j < countArray.length;j++){
            int t = countArray[j];
            if(t != 0){
                for(int k = 0 ; k <= t; k++){
                    System.out.print(j+" ");
                }
            }
        }
    }

}
