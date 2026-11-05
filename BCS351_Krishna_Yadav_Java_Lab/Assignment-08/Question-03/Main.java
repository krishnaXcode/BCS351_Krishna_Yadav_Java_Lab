/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 8
 * Assignment Name: Matrices: Transpose and Row Sums
 * Question: 3
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

              for (int i = 0; i < matrix.length; i++) {
                   int rowSum = 0;
                   for (int j = 0; j < matrix[i].length; j++) {
                       rowSum += matrix[i][j];
                   }
                   System.out.println("Row " + (i + 1) + " sum: " + rowSum);
              }
          }
 }
