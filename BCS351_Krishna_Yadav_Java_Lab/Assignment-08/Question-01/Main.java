/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 8
 * Assignment Name: Matrices: Transpose and Row Sums
 * Question: 1
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              int[][] m = new int[3][4];
              int val = 1;

              for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 4; j++) {
                      m[i][j] = val++;
                  }
              }

              for (int i = 0; i < 3; i++) {
                  for (int j = 0; j < 4; j++) {
                      System.out.print(m[i][j] + " ");
                  }
                  System.out.println();
              }
          }
 }
