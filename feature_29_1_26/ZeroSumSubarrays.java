package feature_29_1_26;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                for (int startIndex : list) {
                    System.out.println("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        findZeroSumSubarrays(arr);

    }
}

