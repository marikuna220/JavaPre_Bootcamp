package com.company;

import java.util.Scanner;

public class LOGINSIMULATOR {


        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

            System.out.println ("enter your user name");
            String username = scanner.nextLine();
            System.out.println("enter your password");
            String password = scanner.nextLine();

            int attempts = 3;
            int attemptNumber = 1;

            while (attempts > 0) {

                if (username.equals("admin") && password.equals("1234")) {
                    System.out.println("Attempt " + attemptNumber + ": Login successful");
                    break;
                } else {
                    System.out.println("Attempt " + attemptNumber + ": Login failed");
                    attempts--;
                    attemptNumber++;
                }

                if (attempts == 0) {
                    System.out.println("Account locked");
                }
            }
        }
    }

