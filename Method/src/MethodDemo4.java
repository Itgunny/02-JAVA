/**
 * Created by gunny on 2017. 6. 22..
 */
public class MethodDemo4 {
    // method의 입력 값은 매개변수(parameter)를 통해서 이루어 진다.
    public static void numbering(int limit) {
        int i = 0;
        while(i < limit) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        // argument : 5
        numbering(5);
    }
}
