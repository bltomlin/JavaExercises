/*
Write a program that reads an array of ints and an integer number n.

The program must check how many times n occurs in the array.

Input data format
The first line contains the size of the input array.

The second line contains elements of the array separated by spaces.

The third line contains n.

Output data format

The result is only a single non-negative integer number.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int counter = 0;
        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] array;
        array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int number = in.nextInt();
            array[i] = number;
        }
        int n = in.nextInt();
        for (int i = 0; i < arrayLength; i++) {
            if (n == array[i]) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
