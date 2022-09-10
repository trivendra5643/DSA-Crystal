package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 9, 5, 11, 3, 7};
        reverseArr(a);
        for(int num: a) System.out.print(num + " ");
    }
    static void reverseArr(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while(i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
