import java.util.Scanner;

public class EmailValidator {
    static class InvalidEmailException extends Exception {
        public InvalidEmailException(String message) {
            super(message);
        }
    }
    public static void validateEmail(String email) throws InvalidEmailException {
        if (email == null || email.trim().isEmpty()) {
            throw new InvalidEmailException("Invalid email: input is empty.");
        }
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email: missing '@' symbol.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            validateEmail(email);
            System.out.println("Valid email: " + email);

        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
