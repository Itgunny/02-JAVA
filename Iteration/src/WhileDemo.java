/**
 * Created by gunny on 2017. 6. 21..
 *
 * while
 *
 * while(condition) {
 *     iteration area
 * }
 *
 * while 문은 반복 조건이 참이면 중괄호 구간을 반복적으로 실행한다.
 *
 * 조건이 false면 반복문이 실행되지 않는다.
 *
 * 반복문에서 종료조건을 잘못 지정하면 무한 반복이 되거나, 반복문이 실행되지 않는다.
 */
public class WhileDemo {
    public static void main(String[] args) {
        // 무한 루프에 빠지게 된다.
        while(true) {
            System.out.println("Coding Everybody");
        }
        // 실행되지 않는다.
        while(false) {
            System.out.println("Coding Everybody");
        }

        int i = 0;
        // i의 값이 10보다 작다면 true, 크다면 false가 된다.
        // 현재 i의 값은 0이기 때문에 이 반복문은 실행된다.
        while(i < 10) {
            System.out.println("Coding Everybody " + i );
            i++;
        }
    }
}
