/*
 * Project: BCS351 Java Programming Lab
 * Assignment: 10
 * Assignment Name: Switch and ArrayList
 * Question: 3
 * Student Name: Krishna Yadav
 * Roll Number: BCS2025400
 * Course: B.Tech CSE - 3rd Semester
 * Subject: Java Programming Lab (BCS351)
 */



 import java.util.ArrayList;

public class Main {
          public static void main(String[] args) {
              ArrayList<Integer> list = new ArrayList<Integer>();

          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);

          list.set(1, 25);
          list.remove(3);

          System.out.println(list);
          System.out.println("Size: " + list.size());
      }
 }
