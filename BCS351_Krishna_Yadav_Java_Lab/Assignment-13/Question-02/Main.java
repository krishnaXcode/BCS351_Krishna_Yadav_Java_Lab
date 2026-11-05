/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 13
 * Assignment Name: Strings: Methods and Palindromes
 * Question: 2
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
       public static void main(String[] args) {
           String word = "Java";
           String reversed = "";

           for (int i = word.length() - 1; i >= 0; i--) {
               reversed += word.charAt(i);
           }

           System.out.println("Reversed: " + reversed);
       }

 }
