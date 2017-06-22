import java.util.Scanner;

/**
 * Created by gunny on 2017. 6. 22..
 */
public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            System.out.println(sc.nextInt() * 1000);
        }
        sc.close();
    }
}
