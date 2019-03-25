package SwapMethod;

public class SwapMethod {
    public static void SwapMethod(int[] arr ,int left ,int right){
        arr[left] = arr[left] ^ arr[right];
        arr[right] = arr[left]^ arr[right];
        arr[left] = arr[left] ^ arr[right];
        System.out.println("制造冲突");
        System.out.println("制造冲突ByIDEA");
        System.out.println("制造冲突byEclipse");
        System.out.println("Git_Method测试提交");
        System.out.println("git_method_Eclipse分支再次提交");
    }
}
