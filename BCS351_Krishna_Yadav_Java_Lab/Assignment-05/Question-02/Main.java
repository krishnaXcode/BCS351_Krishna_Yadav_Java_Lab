/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 5
 * Assignment Name: Arrays: Traversal and Counting
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           int[] arr = {12, 45, 7, 33, 21};
           int sum = 0;
           int largest = arr[0];

           for (int i = 0; i < arr.length; i++) {
               sum += arr[i];
               if (arr[i] > largest) {
                   largest = arr[i];
               }

              }

              System.out.println("Sum: " + sum);
              System.out.println("Largest: " + largest);
          }
 }
