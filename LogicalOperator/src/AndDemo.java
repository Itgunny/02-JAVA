/**
 * Created by gunny on 2017. 6. 21..
 *
 * Boolean의 값을 결합해서 코드를 좀 더 간결하게 만들 수 있는 논리 연산자(Conditional Operator)
 */
public class AndDemo {
    public static void main(String[] args) {

        // 좌항과 우항의 값이 모두 참(true)일 때 참이 된다.
        if(true && true) {
            System.out.println(1);
        }

        if(true && false) {
            System.out.println(2);
        }

        if(false && true) {
            System.out.println(3);
        }

        if(false && false) {
            System.out.println(4);
        }
    }
}
