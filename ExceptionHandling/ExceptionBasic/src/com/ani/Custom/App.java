package com.ani.Custom;

import java.util.InputMismatchException;

import com.ani.Custom.InvalidAgeException;
import com.ani.Custom.UserInputting;
import com.ani.Custom.WrongFileFormatException;

public class App {

    public static void demo1() {
        UserInputting ip = new UserInputting();

        try {
            int age = ip.askForUserAge();
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } 

        try {
            ip.createUserFromFile("abc.txt");
        } catch (WrongFileFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static void demo2() {
        UserInputting ip = new UserInputting();
        try {
            ip.askForUserAge();      
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void demo3() {
        UserInputting ip = new UserInputting();
        try {
            ip.askForDay();
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }

    public static void demo4() {
        UserInputting ip = new UserInputting();
        try {
            ip.askForAmount();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        demo4();
    }   
}