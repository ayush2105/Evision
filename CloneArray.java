package array;

public class CloneArray {
    public static void main(String[] args) {

        int[] originalArray = {10, 20, 30, 40, 50};
        int size = originalArray.length;
        int[] clone = new int[size];
        for (int i = 0; i < size; i++) {
            clone[i] = originalArray[i];
        }
        for (int x : clone) {
            System.out.println(x);
        }
    }
}
