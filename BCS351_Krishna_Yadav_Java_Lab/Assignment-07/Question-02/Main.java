/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 7
 * Assignment Name: Counting Steps and Complexity
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           int steps = 0;

           // Time Complexity: O(n^2)
           for (int i = 1; i <= 10; i++) {
               for (int j = 1; j <= 10; j++) {
                   steps++;
               }
           }

              System.out.println("Steps: " + steps);
          }
 }
