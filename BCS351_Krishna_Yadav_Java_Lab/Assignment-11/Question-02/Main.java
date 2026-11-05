/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 11
 * Assignment Name: Bubble Sort and Selection Sort
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */



 import java.util.Arrays;

public class Main {
       public static void main(String[] args) {
           int[] arr = {64, 25, 12, 22, 11};

           for (int i = 0; i < arr.length - 1; i++) {
               int minIdx = i;
               for (int j = i + 1; j < arr.length; j++) {
                   if (arr[j] < arr[minIdx]) {
                        minIdx = j;

                      }
                  }
                  int temp = arr[minIdx];
                  arr[minIdx] = arr[i];
                  arr[i] = temp;
              }

              System.out.println("Sorted: " + Arrays.toString(arr));
          }
 }
