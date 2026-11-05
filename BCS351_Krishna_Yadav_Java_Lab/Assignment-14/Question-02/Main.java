/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 14
 * Assignment Name: Characters: Counting and Positions
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           String s = "programming";
           int count = 0;

           for (int i = 0; i < s.length(); i++) {
               if (s.charAt(i) == 'g') {
                   count++;
               }
           }

          System.out.println("Count of g: " + count);
      }
 }
