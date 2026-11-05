/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 13
 * Assignment Name: Strings: Methods and Palindromes
 * Question: 4
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              String str = "abc";

              for (int i = 0; i < str.length(); i++) {
                  for (int j = i + 1; j <= str.length(); j++) {
                      System.out.println(str.substring(i, j));
                  }
              }
          }
 }
