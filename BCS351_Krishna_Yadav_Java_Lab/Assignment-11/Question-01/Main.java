/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 11
 * Assignment Name: Bubble Sort and Selection Sort
 * Question: 1
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */



 import java.util.Arrays;

public class Main {
          public static void main(String[] args) {
              int[] arr = {5, 1, 4, 2, 8};

              for (int i = 0; i < arr.length - 1; i++) {
                  for (int j = 0; j < arr.length - 1 - i; j++) {
                      if (arr[j] > arr[j + 1]) {
                          int temp = arr[j];
                          arr[j] = arr[j + 1];
                          arr[j + 1] = temp;
                      }
                  }
              }

              System.out.println("Sorted: " + Arrays.toString(arr));
          }
 }
