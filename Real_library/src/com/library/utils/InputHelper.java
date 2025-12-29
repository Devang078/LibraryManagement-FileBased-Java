package com.library.utils;

import java.util.Scanner;

public class InputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    public static int getIntInput(int min, int max) {
        while (true) {
            try {
                System.out.print("Enter choice: ");
                int input = Integer.parseInt(scanner.nextLine());
                if (input >= min && input <= max) return input;
            } catch (Exception ignored) {}
            System.out.println("Invalid choice! Try again.");
        }
    }
}
