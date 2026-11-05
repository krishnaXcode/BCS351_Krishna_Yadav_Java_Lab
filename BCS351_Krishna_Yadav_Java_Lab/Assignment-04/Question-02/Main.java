/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 4
 * Assignment Name: Writing Functions
 * Question: 2
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

       public static int nPr(int n, int r) {
           return fact(n) / fact(n - r);

          }

          public static void main(String[] args) {
              System.out.println("5P2 = " + nPr(5, 2));
          }
 }
