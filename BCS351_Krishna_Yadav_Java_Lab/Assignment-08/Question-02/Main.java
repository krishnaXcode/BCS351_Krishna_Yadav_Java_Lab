/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 8
 * Assignment Name: Matrices: Transpose and Row Sums
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
           };

           int[][] transpose = new int[3][3];

           for (int i = 0; i < 3; i++) {

                for (int j = 0; j < 3; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
 }
