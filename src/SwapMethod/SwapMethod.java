package SwapMethod;

public class SwapMethod {
    public static void SwapMethod(int[] arr ,int left ,int right){
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left]^ arr[right];
        arr[left] = arr[left] ^ arr[right];
    }
}
