import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        String color;
        color = sc.nextLine();
        if (color.equals("red")) {
            System.out.println("1");
        } else if (color.equals("green")) {
            System.out.println("2");
        } else if (color.equals("black")) {
            System.out.println("3");
        }
        sc.close();
    }
}
