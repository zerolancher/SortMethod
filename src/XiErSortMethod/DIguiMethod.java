package XiErSortMethod;

public class DIguiMethod {
    public static void main(String[] args) {
      /*  int num = getNum(4);
        System.out.println(num);*/
       /* int result = getResultToFibonacci(5);
        System.out.println(result);*/
       /* DIguiMethod method = new DIguiMethod();
        method.getHanno(3,'a','b','c');*/
       int[] arr = {1,2,10,4,5,6};
        int i = ArrayIsInSort(arr,arr.length);
        if(i > 0){
            System.out.println("有序");
        }else {
            System.out.println("无序");
        }
    }
    public static int getNum(int Num){
        if(Num == 1){
            return 1;
        }else {
            return Num* getNum(Num -1);
        }
    }
    public static int getResultToFibonacci(int Num){
        if(Num == 1 || Num ==2){
            return  1;
        }else{
            return getResultToFibonacci(Num -1) + getResultToFibonacci(Num -2);
        }
    }
    public void  getHanno(int i ,char a,char b,char c){
         if(i == 1){
             move(a,c);
         }else{
             getHanno(i-1,a,c,b);
             move(a,c);
             getHanno(i-1,b,a,c);
         }
    }
    public void move(char a ,char c){
        System.out.println("move:"+a+"--"+c);
    }

    public static int ArrayIsInSort(int[] arr,int index){
        if(index == 1){
            return 1;
        }else {
            return arr[index-1] - arr[index -2] <0? 0:ArrayIsInSort(arr,index-1);
        }
    }

}
