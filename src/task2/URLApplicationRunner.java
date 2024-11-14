package task2;

import java.util.Scanner;

public class URLApplicationRunner {
    public static void main(String[] args) {
        System.out.println("Enter link:");
        Scanner scanner = new Scanner(System.in);
        String inputLink = scanner.nextLine();
        if (URLValidator.isURLValid(inputLink)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
    }

