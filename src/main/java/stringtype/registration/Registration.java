package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your user name:");
        String username = scanner.nextLine();
        System.out.println("Your user name isValid: "+userValidator.isValidUsername(username));

        System.out.println("Please write your password:");
        String password1 = scanner.nextLine();

        System.out.println("Please write your password again:");
        String password2 = scanner.nextLine();
        System.out.println("Your password isValid: "+userValidator.isValidPassword(password1, password2));

        System.out.println("Please write your email address:");
        String email = scanner.nextLine();
        System.out.println("your email isValid: "+userValidator.isValidEmail(email));
    }

}
