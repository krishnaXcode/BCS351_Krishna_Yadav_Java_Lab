/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 2
 * Assignment Name: Decisions and Loops with Numbers
 * Question: 4
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           int n = 5;
           int fact = 1;

           for (int i = 1; i <= n; i++) {

               fact *= i;
          }

          System.out.println("Factorial of " + n + " is " + fact);
      }
 }
