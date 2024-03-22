import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble(); 

        System.out.println(fahr(c));
        sc.close();
    }
    static double fahr(double c){
        return c * 1.8 + 32;
    }
}
