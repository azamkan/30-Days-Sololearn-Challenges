import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int celcius = sc.nextInt();
        if (celcius >= 100){
            System.out.println("Boiling");
        } else {
            System.out.println("Not boiling");
        }
        sc.close();
    }
}
