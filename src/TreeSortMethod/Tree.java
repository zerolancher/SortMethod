package TreeSortMethod;

import SwapMethod.SwapMethod;

public class Tree {
    public void down(int[] arr, int index, int len) {
        boolean flag = false;
        int t = 0;
        while (index * 2 + 1 < len && flag == false) {

            if (arr[index] > arr[index * 2 + 1]) {
                t = index * 2 + 1;
            }
            if (index * 2 + 2 < len) {
                if (arr[t] > arr[index * 2 + 2]) {
                    t = index * 2 + 2;
                }
            }
            if (t != index) {
                SwapMethod.SwapMethod(arr, t, index);
                index = t;
            } else {
                flag = true;
            }
        }
    }

    public void createMinStack(int[] arr) {
        int lastParent = arr.length / 2;
        for (int i = lastParent; i >= 0; i--) {
            down(arr, i, arr.length);
        }
    }

    public void selectMin(int[] arr, int len) {
        int t = 0;
        t = arr[0];
        arr[0] = arr[len];
        len--;
        down(arr, 0, len);
        System.out.print(t+" ");
    }

    public void up(int[] arr, int index) {
        if (index == 0) {
            return;
        }
        boolean flag = false;
        while (index != 0 && flag == false){
            if(arr[index] > arr[index/2]){
                SwapMethod.SwapMethod(arr,index,index/2);

            }else {
                flag = true;
            }
            index = index /2;
        }
    }

}
