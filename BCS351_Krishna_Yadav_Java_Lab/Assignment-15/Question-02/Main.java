/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 15
 * Assignment Name: StringBuilder Methods
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           StringBuilder sb = new StringBuilder();

           for (int i = 1; i <= 5; i++) {
               sb.append(i).append(",");
           }

           sb.deleteCharAt(sb.length() - 1);

           System.out.println(sb);

          }
 }
