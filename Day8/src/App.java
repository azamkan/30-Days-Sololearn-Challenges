import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        long fact = 1;
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        for (int i = 1; i <= start; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        sc.close();
    }
}
