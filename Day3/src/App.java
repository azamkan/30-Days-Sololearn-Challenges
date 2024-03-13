import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        double tip = (bill * 15) / 100 ;
        System.out.println(tip);
        sc.close();
    }
}
