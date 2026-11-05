/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 12
 * Assignment Name: Insertion Sort
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */



 import java.util.Arrays;

public class Main {
       public static void main(String[] args) {
           int[] arr = {14, 3, 9, 21, 6};

           for (int i = 1; i < arr.length; i++) {
               int key = arr[i];
               int j = i - 1;
               while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];

                    j--;
               }
               arr[j + 1] = key;
          }

          System.out.println("Sorted: " + Arrays.toString(arr));
      }
 }
