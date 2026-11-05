/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 13
 * Assignment Name: Strings: Methods and Palindromes
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
          public static void main(String[] args) {
              String word = "racecar";
              boolean isPalindrome = true;

              int left = 0;
              int right = word.length() - 1;
              while (left < right) {

               if (word.charAt(left) != word.charAt(right)) {
                      isPalindrome = false;
                      break;
                }
                left++;
                right--;
           }

           if (isPalindrome) {
                System.out.println(word + " is a palindrome");
           } else {
                System.out.println(word + " is not a palindrome");
           }
       }
 }
