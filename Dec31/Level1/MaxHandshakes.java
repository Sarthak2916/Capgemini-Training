package Level1;

import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfStudents = input.nextInt();
        int maxHandshakes = noOfStudents*(noOfStudents-1)/2;
        System.out.println("Max possible no. of Handshakes "+maxHandshakes);
    }
}
