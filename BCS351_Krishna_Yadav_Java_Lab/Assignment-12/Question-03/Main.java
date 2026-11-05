/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 12
 * Assignment Name: Insertion Sort
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {

      public static void main(String[] args) {
          int[] arr = {6, 5, 4, 3, 2, 1};
          int shifts = 0;

          for (int i = 1; i < arr.length; i++) {
               int key = arr[i];
               int j = i - 1;
               while (j >= 0 && arr[j] > key) {
                   arr[j + 1] = arr[j];
                   shifts++;
                   j--;
               }
               arr[j + 1] = key;
          }

          System.out.println("Shifts: " + shifts);
      }
 }
