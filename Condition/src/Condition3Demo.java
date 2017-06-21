/**
 * Created by gunny on 2017. 6. 19..
 *
 * else : if 만으로는 좀 더 복잡한 상황을 처리하는데 부족하다. 아래의 그림처럼 if-else절은 if 절의 값이 true일 때
 * then 절이 실행되고 false 일 때 else 절이 실행된다.
 */
public class Condition3Demo {
    public static void main(String[] args) {
        if (true) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        if (false) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }
}
