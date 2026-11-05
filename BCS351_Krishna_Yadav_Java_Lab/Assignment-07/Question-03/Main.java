/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 7
 * Assignment Name: Counting Steps and Complexity
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              int n = 1024;
              int count = 0;

          // Time Complexity: O(log n)
          while (n > 1) {
               n = n / 2;
               count++;
          }

          System.out.println("Halving steps: " + count);
      }
 }
