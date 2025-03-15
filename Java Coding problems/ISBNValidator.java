import java.util.Scanner;

public class ISBNValidator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the ISBN string
        String isbn = sc.nextLine().replaceAll("-", ""); // Remove hyphens if present
        
        // Validate the ISBN
        if (isValidISBN10(isbn)) {
            System.out.println("ISBN Number is Valid");
        } else if (isValidISBN13(isbn)) {
            System.out.println("ISBN Number is Valid");
        } else {
            System.out.println("ISBN Number is Not Valid");
        }

        sc.close();
    }

    // Function to validate ISBN-10
    public static boolean isValidISBN10(String isbn) {
        // ISBN-10 should be 10 characters long
        if (isbn.length() != 10) {
            return false;
        }

        int sum = 0;
        
        // Iterate through the first 9 characters
        for (int i = 0; i < 9; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                return false;
            }
            sum += (isbn.charAt(i) - '0') * (10 - i);
        }

        // Check the 10th character
        char lastChar = isbn.charAt(9);
        if (lastChar == 'X') {
            sum += 10; // 'X' represents 10
        } else if (Character.isDigit(lastChar)) {
            sum += (lastChar - '0');
        } else {
            return false;
        }

        // ISBN-10 is valid if sum is divisible by 11
        return sum % 11 == 0;
    }

    // Function to validate ISBN-13
    public static boolean isValidISBN13(String isbn) {
        // ISBN-13 should be 13 digits long
        if (isbn.length() != 13) {
            return false;
        }

        int sum = 0;

        // Iterate through all 13 digits
        for (int i = 0; i < 13; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                return false;
            }

            int digit = isbn.charAt(i) - '0';

            // Multiply by 1 if index is even, multiply by 3 if index is odd
            if (i % 2 == 0) {
                sum += digit;
            } else {
                sum += digit * 3;
            }
        }

        // ISBN-13 is valid if sum is divisible by 10
        return sum % 10 == 0;
    }
}

