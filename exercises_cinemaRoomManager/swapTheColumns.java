/*
* Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.
*
* Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.
*
*/

import java.util.Scanner;
import java.util.Arrays;

class Main {

    /*
     *  Creates the matrix
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] doubleArray;
        doubleArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < m; y++) {
                doubleArray[i][y] = in.nextInt();
            }
        }

        /* 
         *  Column swap
         */
        int i = in.nextInt();
        int j = in.nextInt();
        for (int c = 0; c < doubleArray.length; c++) {   
            int temp = doubleArray[c][i];
            doubleArray[c][i] = doubleArray[c][j];
            doubleArray[c][j] = temp;
        }
        
        /*
         *  Prints swapped matrix
         */
        for (int a = 0; a < doubleArray.length; a++) {
            for (int b = 0; b < doubleArray[0].length; b++)
                System.out.print(doubleArray[a][b] + " ");
            System.out.println();
        }
    }
}