/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 4
 * Assignment Name: Writing Functions
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */

public class Main {
    public static int maxOf(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Larger: " + maxOf(14, 9));
    }
}
