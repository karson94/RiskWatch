import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        RiskWatchNotificationSystem notificationSystem = new RiskWatchNotificationSystem();

        //Users should be able to input contact information such as
// name, phone number, and/or email address for each emergency contact.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your email address: ");
        String email = scanner.nextLine();
        User user = new User(name, phoneNumber, email);


    }
}