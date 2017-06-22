import java.util.Scanner;

/**
 * Created by gunny on 2017. 6. 22..
 */
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i * 1000);
        sc.close();
    }
}
