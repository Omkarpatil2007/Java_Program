import java.util.*;

class AuthenticationFailure extends Exception {
    AuthenticationFailure(String s) {
        super(s);
    }
}

class Authentication1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "omkar";
        System.out.println("Enter the password:");
        String inputPassword = sc.nextLine();

        try {
            // Check if the entered password matches the correct password
            if (!inputPassword.equals(correctPassword)) {
                // Throw an AuthenticationFailure exception if the password is incorrect
                throw new AuthenticationFailure("Password is incorrect");
            } else {
                System.out.println("Password is correct");
            }
        } catch (AuthenticationFailure e) {
            // Catch and handle the AuthenticationFailure exception
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
