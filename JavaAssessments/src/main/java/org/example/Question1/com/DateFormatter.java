package org.example.Question1.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Format the date to MM-dd-yyyy pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = currentDate.format(formatter);

        // Print the formatted date
        System.out.println("Formatted Date: " + formattedDate);
    }
}
