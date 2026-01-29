package feature_29_1_26;

import java.util.*;

public class DataStructureForSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr[i] = value;
            hashSet.add(value);
            treeSet.add(value);
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean foundInArray = false;
        for (int num : arr) {
            if (num == key) {
                foundInArray = true;
                break;
            }
        }

        boolean foundInHashSet = hashSet.contains(key);

        boolean foundInTreeSet = treeSet.contains(key);

        System.out.println("\nSearch Results:");
        System.out.println("Array: " + (foundInArray ? "Element found" : "Element not found"));
        System.out.println("HashSet: " + (foundInHashSet ? "Element found" : "Element not found"));
        System.out.println("TreeSet: " + (foundInTreeSet ? "Element found" : "Element not found"));

    }
}

