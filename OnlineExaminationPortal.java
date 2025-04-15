import java.util.Scanner;
import java.util.HashMap;
public class OnlineExaminationPortal {

    static HashMap<String, String> users = new HashMap<>(); // For storing usernames and passwords
    static Scanner sc = new Scanner(System.in);
    static int score = 0;

    public static void main(String[] args) {
        users.put("admin", "password"); // Default user
        System.out.println("Welcome to Online Examination Portal");

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you for using the portal!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void register() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (users.containsKey(username)) {
            System.out.println("Username already exists. Try logging in.");
        } else {
            users.put(username, password);
            System.out.println("Registration successful!");
        }
    }

    static void login() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login successful!");
            examMenu();
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }
    }

    static void examMenu() {
        System.out.println("\n--- Exam Menu ---");
        System.out.println("1. Start Exam");
        System.out.println("2. View Score");
        System.out.println("3. Logout");
        System.out.print("Choose an option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                startExam();
                break;
            case 2:
                System.out.println("Your score: " + score);
                examMenu();
                break;
            case 3:
                System.out.println("Logged out successfully!");
                break;
            default:
                System.out.println("Invalid choice. Returning to exam menu.");
                examMenu();
        }
    }

    static void startExam() {
        System.out.println("\n--- Exam Started ---");

        String[] questions = {
            "1. What is the capital of France?\n(a) Paris\n(b) Berlin\n(c) Rome\n(d) Madrid",
            "2. Who developed Java?\n(a) Microsoft\n(b) Oracle\n(c) Sun Microsystems\n(d) IBM",
            "3. What is 5 + 3?\n(a) 5\n(b) 8\n(c) 10\n(d) 15"
        };

        char[] answers = {'a', 'c', 'b'};

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer: ");
            char answer = sc.nextLine().charAt(0);

            if (answer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i]);
            }
        }

        System.out.println("Exam completed!");
        examMenu();
    }
}
