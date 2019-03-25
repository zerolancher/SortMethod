package GUiBIng_SortMethod;

public class GuiBing_SortMethod {
    public static void main(String[] args) {
       // int []arr = {9,8,7,6,5,4,3,2,1};
        int[] arr ={2,3,5,1,23,6,78,34,23,4,5,78,34,65,32,65,76,32,76,1,9};
        sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    //排序，调用该方法
    public static void sort(int[] arr){
        int[] temp = new int[arr.length];//每次声明一个中间数组，用以进行转换
        split_and_Merage(arr,temp,0,arr.length-1);

    }


    //分解包含合并，调用另一个方法。用到了递归,这里会将数组拆分为两个部分 左：left mid 右：mid+1 right
    public static void  split_and_Merage(int[] source,int[] temp,int left,int right){
          if(left < right){
              int mid = (left+right)/2;
              split_and_Merage(source,temp,left,mid);
              split_and_Merage(source,temp,mid+1,right);
              Merage(source,temp,left,mid,right);
          }
    }

    //合并算法
    public static void Merage(int[] source,int[] temp,int left,int mid,int right){
         int i = left;
         int j = mid+1;
         int t = 0;
         while (i<=mid+1&&j<=right ){
             if(source[i] <=source[j]){
                 temp[t++] = source[i++];
             }else{
                 temp[t++] = source[j++];
             }
         }
         while (i <= mid){
             temp[t++] = source[i++];
         }
         while (j <right){
             temp[t++] =source[j++];
         }
         t = 0;
         //最后合并时，要从left开始，因为分割后的数组角标不一定。
          while (left <= right){
              source[left++] = temp[t++];
          }

    }
}
