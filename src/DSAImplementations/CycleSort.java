package DSAImplementations;

public class CycleSort {
    public static void main(String[] args) {
//        int[] arr = {3, 11, 3, 7, 9, 1, 11};
        int[] arr = {7, 1, 3, 11, 2, 7, 9, 6, 2, 1, 9, 6};
        int ans = cycleSort(arr);
        for(int num: arr) System.out.print(num + " ");
        System.out.println();
        System.out.println(ans);
    }

    static void cycleSortDistinct(int[] arr) {
        for(int cs = 0; cs < arr.length - 1; cs++) {
            int pos = cs;
            int item = arr[cs];
            for(int i = cs + 1; i < arr.length; i++) {
                if(arr[i] < item) pos++;
            }
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            while(pos != cs) {
                pos = cs;
                for(int i  = cs + 1; i < arr.length; i++) {
                    if(arr[i] < item) pos++;
                }
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
        }

    }
    static int cycleSort(int[] arr) {
        int minSwap = 0;
        for(int cs = 0; cs < arr.length - 1; cs++) {
            int item = arr[cs];
            int pos = cs;
            for(int i = cs + 1; i < arr.length; i++) {
                if(arr[i] < item) pos++;
            }
            int temp = item;
            item = arr[pos];
            arr[pos] = temp;
            minSwap++;
            while(pos != cs) {
                pos = cs;
                for(int i  = cs + 1; i < arr.length; i++) {
                    if(arr[i] < item) pos++;
                }
                while(item == arr[pos]) pos++;
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
                minSwap++;
            }
        }
        return minSwap;
    }

    static int cycleSortRev(int[] arr) {
        int res = 0;
        for(int z = 0; z < arr.length; z++) {
            int item = arr[z];
            while(true) {
                int pos = 0;
                for(int j = 0; j < arr.length; j++) {
                    if(arr[j] < item) pos++;
                }
                if(pos == z) break;
                item = arr[pos];
                res++;
                arr[pos] = arr[z];
                arr[z] = item;
            }
        }
        return res;
    }

}
