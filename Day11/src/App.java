import java.util.Scanner;

public class App {
    static void bot() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        scanner.close();
        switch (userInput) {
            case 1:
                System.out.println("Order confirmed");
                break;
            case 2:
                System.out.println("info@sololearn.com");
                break;
            default:
                System.out.println("Try again");
                break;
        }
    }
    public static void main(String[] args) {
        bot();
    }
}
