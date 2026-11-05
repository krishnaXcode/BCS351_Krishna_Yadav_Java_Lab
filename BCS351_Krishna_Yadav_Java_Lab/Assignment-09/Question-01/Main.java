/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 9
 * Assignment Name: Matrices: Rows and Columns
 * Question: 1
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

              System.out.print("First row:");
              for (int j = 0; j < matrix[0].length; j++) {
                   System.out.print(" " + matrix[0][j]);
              }
              System.out.println();

              System.out.print("Last row:");
              for (int j = 0; j < matrix[matrix.length - 1].length; j++) {
                   System.out.print(" " + matrix[matrix.length - 1][j]);
              }
              System.out.println();
          }
 }
