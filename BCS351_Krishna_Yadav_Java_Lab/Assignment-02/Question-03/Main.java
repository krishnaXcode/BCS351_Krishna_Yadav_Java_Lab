/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 2
 * Assignment Name: Decisions and Loops with Numbers
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              int year = 2024;

              if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                  System.out.println("Leap year");
              } else {

               System.out.println("Not a leap year");
          }
      }
 }
