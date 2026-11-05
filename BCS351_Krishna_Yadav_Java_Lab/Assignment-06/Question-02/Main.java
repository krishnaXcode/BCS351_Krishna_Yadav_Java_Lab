/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 6
 * Assignment Name: Arrays: Reverse and Duplicates
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           int[] arr = {2, 5, 1, 8, 3, 4};
           int smallest = arr[0];
           int index = 0;

           for (int i = 1; i < arr.length; i++) {
               if (arr[i] < smallest) {
                   smallest = arr[i];
                   index = i;
               }

              }

              System.out.println("Smallest: " + smallest + " at index " + index);
          }
 }
