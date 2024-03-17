import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int start = 0;
        int num = sc.nextInt();
        while (start < num) {
            start++;
            count = count + start;
        }
        count--;
        System.out.println(count);
        sc.close();
    }
}
