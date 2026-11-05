/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 6
 * Assignment Name: Arrays: Reverse and Duplicates
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              int[] arr = {4, 9, 2, 9, 7};
              boolean found = false;

          int repeated = 0;

          for (int i = 0; i < arr.length; i++) {
               for (int j = i + 1; j < arr.length; j++) {
                     if (arr[i] == arr[j]) {
                         repeated = arr[i];
                         found = true;
                         break;
                     }
               }
               if (found) {
                     break;
               }
          }

          if (found) {
               System.out.println("Repeated value: " + repeated);
          } else {
               System.out.println("No repeated value");
          }
      }
 }
