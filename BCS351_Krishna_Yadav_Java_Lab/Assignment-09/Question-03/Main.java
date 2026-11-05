/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 9
 * Assignment Name: Matrices: Rows and Columns
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

          int count = 0;
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[i].length; j++) {
                   if (matrix[i][j] > 5) {
                       count++;
                   }
               }
          }

          System.out.println("Values greater than 5: " + count);
      }
 }
