/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 5
 * Assignment Name: Arrays: Traversal and Counting
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              int[] arr = {5, 12, 2, 14, 7};

          int count = 0;

          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > 10) {
                   count++;
               }
          }

          System.out.println("Count greater than 10: " + count);
      }
 }
