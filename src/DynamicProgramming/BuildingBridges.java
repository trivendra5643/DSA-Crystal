package DynamicProgramming;

import java.util.*;

class CityPairs {
    int north, south;

    CityPairs(int north, int south) {
        this.north = north;
        this.south = south;
    }
}

class myCmp implements Comparator<CityPairs> {
    public int compare(CityPairs c1, CityPairs c2) {
        if(c1.north == c2.north) return c1.south - c2.south;
        return c1.north - c2.north;
    }
}


public class BuildingBridges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CityPairs[] city_pairs = new CityPairs[n];
        for(int i = 0; i < n; i++) {
            int north = sc.nextInt();
            int south = sc.nextInt();
            city_pairs[i] = new CityPairs(north, south);
        }
        Arrays.sort(city_pairs, new myCmp());
        System.out.println(solution(city_pairs));
    }
    static int solution(CityPairs[] city_pairs) {
        int[] arr = new int[city_pairs.length];
        arr[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = 1;
            for(int j = i - 1; j >= 0; j--) {
                if(city_pairs[j].south <= city_pairs[i].south) {
                    arr[i] = Math.max(arr[i], 1 + arr[j]);
                }
            }
        }
        int res = 0;
        for(int i = 0; i < arr.length; i++) res = Math.max(res, arr[i]);
        return res;
    }
}
