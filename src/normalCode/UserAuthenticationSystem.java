package normalCode;//package normalCode;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//public class UserAuthenticationSystem {
//        private static Map<String, String> users = new HashMap<>();
//
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            // Registration
//            System.out.println("Registration Page");
//            System.out.print("Enter Display Name: ");
//            String displayName = scanner.nextLine();
//            System.out.print("Enter Email: ");
//            String email = scanner.nextLine();
//            System.out.print("Enter Password: ");
//            String password = scanner.nextLine();
//
//            registerUser(displayName, email, password);
//            System.out.println("Registration successful!");
//
//            // Login
//            System.out.println("\nLogin Page");
//            System.out.print("Enter Email: ");
//            String loginEmail = scanner.nextLine();
//            System.out.print("Enter Password: ");
//            String loginPassword = scanner.nextLine();
//
//            if (authenticateUser(loginEmail, loginPassword)) {
//                System.out.println("Login successful! Welcome, " + users.get(loginEmail));
//            } else {
//                System.out.println("Invalid credentials. Please try again.");
//            }
//
//            scanner.close();
//        }
//
//        private static void registerUser(String displayName, String email, String password) {
//            users.put(email, displayName + ":" + password); // Store email and password (insecure, for demo purposes)
//        }
//
//        private static boolean authenticateUser(String email, String password) {
//            return users.containsKey(email) && users.get(email).split(":")[1].equals(password);
//
//    }
//}



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserAuthenticationSystem {
    private static Map<String, String> users = new HashMap<>();

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        // Registration
        System.out.println("Registration Page");
        System.out.print("Enter Display Name: ");
        String displayName = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        if (!isValidEmail(email)) {
            System.out.println("Invalid email format. Email must end with '@gmail.com'.");
            return;
        }
        System.out.print("Enter Password (format: Ram@12345): ");
        String password = scanner.nextLine();
        if (!isValidPassword(password)) {
            System.out.println("Invalid password format. Password must be in the format 'Ram@12345'.");
            return;
        }

        registerUser(displayName, email, password);
        System.out.println("Registration successful!");

        // Login
        System.out.println("\nLogin Page");
        System.out.print("Enter Email: ");
        String loginEmail = scanner.nextLine();
        System.out.print("Enter Password: ");
        String loginPassword = scanner.nextLine();

        if (authenticateUser(loginEmail, loginPassword)) {
            System.out.println("Login successful! Welcome, " + users.get(loginEmail));
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        scanner.close();
    }

    private static void registerUser(String displayName, String email, String password) {
        users.put(email, displayName + ":" + password); // Store email and password (insecure, for demo purposes)
    }

    private static boolean authenticateUser(String email, String password) {
        return users.containsKey(email) && users.get(email).split(":")[1].equals(password);
    }

    private static boolean isValidEmail(String email) {
        return email.endsWith("@gmail.com");
    }

    private static boolean isValidPassword(String password) {
        // Password format: Ram@12345
        boolean matches = password.matches("[a-zA-Z]{1,9}[!@#$%^&*]{1}[0-9]{1,10}");
        return matches;
    }
}
