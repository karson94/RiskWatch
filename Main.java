import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (format: First Name Last Name): ");
        String name = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        // Validate the name format
        boolean isValidNameFormat = isValidNameFormat(name);

        // Validate the email address
        boolean isValidEmail = isValidEmail(email);

        // Validate the phone number
        boolean isValidPhoneNumber = isValidPhoneNumber(phoneNumber);

        if (isValidNameFormat && isValidEmail && isValidPhoneNumber) {
            System.out.println("All inputs are valid.");
            // Proceed with further operations
        } else {
            System.out.println("Invalid input. Please check your inputs and try again.");
            // Handle the case where the input is invalid
        }

        scanner.close();
    }

    public static boolean isValidNameFormat(String name) {
        // Validate if the name format is "First Name Last Name"
        String[] nameParts = name.split(" ");
        return nameParts.length == 2;
    }

    public static boolean isValidEmail(String email) {
        // Regular expression for basic email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        // Validate email against the regular expression
        return email.matches(emailRegex);
    }

    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Regular expression for basic phone number validation
        String phoneRegex = "^[0-9 ()-]+$";
        // Validate phone number against the regular expression
        return phoneNumber.matches(phoneRegex);
    }
}

/*import org.apache.commons.validator.routines.EmailValidator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();

        // Validate the email address
        boolean isValid = isValidEmail(email);

        if (isValid) {
            System.out.println("Email is valid.");
            // Create a User object with the provided information
            User user = new User(name, phoneNumber, email);
            // Proceed with further operations
        } else {
            System.out.println("Invalid email address. Please enter a valid email.");
            // Handle the case where the email is invalid
        }

        // Close the scanner
        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        // Create an instance of EmailValidator
        EmailValidator validator = EmailValidator.getInstance();
        // Validate the email address using Apache Commons Validator
        return validator.isValid(email);
    }
}
*/

