/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 4
 * Assignment Name: Writing Functions
 * Question: 1
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static int fact(int n) {
              int f = 1;
              for (int i = 1; i <= n; i++) {
                  f *= i;
              }
              return f;
          }

          public static int nCr(int n, int r) {
              return fact(n) / (fact(r) * fact(n - r));
          }

          public static void main(String[] args) {
              System.out.println("5C2 = " + nCr(5, 2));
          }
 }
