package org.example.Question3.com;

import java.time.LocalDate;
import java.util.Scanner;

class DateComparator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input date
        System.out.println("Enter a date (yyyy-MM-dd):");
        String inputDateString = scanner.next();
        LocalDate inputDate = LocalDate.parse(inputDateString);

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Compare dates
        if (inputDate.isEqual(currentDate)) {
            System.out.println("Current Date: " + currentDate);
            System.out.println("Input Date: " + inputDate);
            System.out.println("Output: Given input date is equal to the current date.");
        } else if (inputDate.isBefore(currentDate)) {
            System.out.println("Current Date: " + currentDate);
            System.out.println("Input Date: " + inputDate);
            System.out.println("Output: Given input date is before the current date.");
        } else {
            System.out.println("Current Date: " + currentDate);
            System.out.println("Input Date: " + inputDate);
            System.out.println("Output: Given input date is after the current date.");
        }
    }
}
