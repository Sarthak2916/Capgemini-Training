package feature_29_1_26;

import java.util.Scanner;

public class Fibonacci {

    static int fibRecursive(int n) {
        if (n <= 1)
            return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("\nFibonacci (Iterative):");
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("\n\nFibonacci (Recursive):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRecursive(i) + " ");
        }

    }
}
