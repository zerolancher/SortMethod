package TreeSortMethod;

public class Demo {
    public static void main(String[] args) {
        int[] data = {9, 3, 7, 6, 5, 1, 10, 2};
        Tree tree = new Tree();
        tree.createMinStack(data);
        int len = data.length;
        for(int i = 0 ; i < data.length ; i++){
            tree.selectMin(data,--len);
        }
    }
}
