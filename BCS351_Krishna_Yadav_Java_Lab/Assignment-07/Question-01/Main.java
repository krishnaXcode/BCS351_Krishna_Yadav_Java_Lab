/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 7
 * Assignment Name: Counting Steps and Complexity
 * Question: 1
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              int steps = 0;

              // Time Complexity: O(n)
              for (int i = 1; i <= 10; i++) {
                  steps++;
              }

              System.out.println("Steps: " + steps);
          }
 }
