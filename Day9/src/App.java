import  java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice < menu.length) {
            System.out.println(menu[choice]);
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }
}
