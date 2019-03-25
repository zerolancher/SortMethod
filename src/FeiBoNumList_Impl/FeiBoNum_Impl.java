package FeiBoNumList_Impl;

import java.util.HashMap;

public class FeiBoNum_Impl {  //斐波那数列实现（递归），效率低
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
       // int num = findNum(30);
     // int num = findNumImp01(30);
      int num = FeiBoNum_ByDonmatic(30);
        System.out.println(num);
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间为:"+(endTime-startTime));
    }
    public static int  findNum(int index){
         if(index == 1 || index == 2){
            return 1;
         }
         return findNum(index-2)+findNum(index-1);
    }
    private static HashMap<Integer,Integer> map = new HashMap<>();
    public static int findNumImp01(int index){//采用缓存机制来减少递归次数(备忘录)
          if(index == 1 || index == 2){
              return 1;
          }
          if(map.containsKey(index)){
              return map.get(index);
          }else {
              int value = findNumImp01(index-1)+findNumImp01(index-2);
              map.put(index,value);
              return value;
          }
    }

    //动态规划，将原问题分解为相似的子问题，在求解过程中通过子问题的解答来求出原问题的解

    public static int  FeiBoNum_ByDonmatic(int index){
           if(index == 1|| index ==2){//动态规划
               return 1;
           }
           int a = 1;
           int b = 1;
           int temp = 0;
           for(int i =3 ;i <=index;i++){
              temp = a + b;
               a = b;
               b = temp;
           }
           return temp;
    }
}
