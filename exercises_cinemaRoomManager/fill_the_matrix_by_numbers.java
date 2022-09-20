/*
 * Given the number n, not greater than 100, create a matrix of size n×n and fill it using the following rule. Numbers 0 should be stored on the primary (main) diagonal. 
 * The two diagonals, adjacent to the primary one, should contain numbers 1. The next two diagonals should contain numbers 2; etc.
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            for (int q = 0; q < n; q++) {
                if (q == i) {
                    System.out.print(0 + " ");
                } else if (q < i) {
                    System.out.print(((q - i) * -1) + " ");
                } else {
                    System.out.print((q - i) + " ");
                }
            } System.out.println();
        }
    }
}
