package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Robot robot_one = new Robot();
        System.out.println(robot_one.name);


//        Ask the user their name
//        Print it to console
//        If their name EQUALS "Bob"
//        Print "Hi Bob!"
    System.out.println("What is your name?");

    Scanner sc = new Scanner(System.in);

    String response = sc.nextLine();

    System.out.println(response);

    String name = "Name";

    if(response.equals("Bob")){
        System.out.println("Hi Bob");
    }



//        Instantiate a ArrayList<Integer>
//        Use a For to ADD the numbers 0-7 to the ArrayList

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 8; i++) {
            numbers.add(i);

        }

        for(int number: numbers){
            System.out.println(number);
        }



    }
}