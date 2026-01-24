package Backtracking;

import java.util.Scanner;

public class GenerateBinaryStrings {

    // Recursive method to generate binary strings
    static void generate(String curr, int n) {
        // Base case
        if (curr.length() == n) {
            System.out.println(curr);
            return;
        }

        // Choose 0
        generate(curr + "0", n);

        // Choose 1
        generate(curr + "1", n);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of binary string: ");
        int n = sc.nextInt();

        System.out.println("Binary strings of length " + n + ":");
        generate("", n);   // start with empty string
    }
}
