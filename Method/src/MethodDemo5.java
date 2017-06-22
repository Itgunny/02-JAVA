/**
 * Created by gunny on 2017. 6. 22..
 */
public class MethodDemo5 {
    // method로 여러개의 입력 값을 전달하고 싶다면 파라미터를 원하는 갯수로 두면된다.
    public static void numbering(int init, int limit) {
        int i = init;
        while(i < limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(1, 5);
    }
}
