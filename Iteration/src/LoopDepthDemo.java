/**
 * Created by gunny on 2017. 6. 21..
 *
 * 반복문 안에는 다시 반복문이 나타날 수 있다.
 */
public class LoopDepthDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
