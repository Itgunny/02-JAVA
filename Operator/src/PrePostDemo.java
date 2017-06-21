/**
 * Created by gunny on 2017. 6. 19..
 * 1+2에서 사용한 연산자 +는 이항연산자이고, 좌항인 1과 우항인 2를 더해주는 작업을 하고 있다.
 * 단한 연산자는 하나의 항을 대상으로 연산이 이루어지는 연산자이다.
 * + : 양수를 표현한다. 실제로는 사용할 필요가 없다.
 * - : 음수를 표현한다.
 * ++ : 증가(increment) 연산자로 항의 값을 1씩 증가 시킨다.
 * -- : 감소(Decrement) 연산자
 *
 */
public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;

        i++;
        System.out.println(i); // 4 출력
        ++i;
        System.out.println(i); // 5 출력

        // ++ i는 i의 값에 1이 더해진 값을 출력하는 것이고,
        // i++는 이것이 속해있는 println에 일단 현재 i의 값을 출력하고, println의 실행이 끝난 후에 i의 값이 증가하는 특성이 있다.
        System.out.println(++i); // 6 출력
        System.out.println(i++); // 6 출력
        System.out.println(i); // 7 출력



    }
}
