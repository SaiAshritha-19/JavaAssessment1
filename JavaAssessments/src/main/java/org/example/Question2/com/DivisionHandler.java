package org.example.Question2.com;

public class DivisionHandler {
    public static void main(String[] args) {
        try {
            double dividend = 10;
            double divisor = 0;
            double result = performDivision(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (CustomException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    public static double performDivision(double dividend, double divisor) throws CustomException {
        double result;
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Divisor cannot be zero");
            }
            result = dividend / divisor;
        } catch (ArithmeticException e) {
            System.out.println("Exception occurred: " + e.getMessage());
            throw new CustomException("Please pass a valid divisor");
        } finally {
            System.out.println("Dividend used: " + dividend);
            System.out.println("Divisor used: " + divisor);
        }
        return result;
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

