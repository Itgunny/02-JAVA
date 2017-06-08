/**
 * Created by gunny on 2017. 6. 8..
 *
 * 숫자와 문자 : 실제로 가장 많이 사용되는 데이터 형인 숫자를 프로그래밍에서
 * 어떻게 표현하고 연산하는지 알아보자.
 *
 * 데이터 타입은 자료형 또는 데이터 형이라고 한다.
 */
public class NumberAndString {
    public static void main(String[] args) {


        /*
            Number
         */

        // 자바에서는 따옴표가 없는 숫자는 숫자로 인식한다.
        System.out.println(1+2);

        // 자바에서는 소수점을 기본으로 double로 인식한다.
        System.out.println(1.5+2.5);

        // 곱하기를 할 때는 * 를 사용한다.
        System.out.println(2 * 5);

        // 나누기를 할 때는 / 를 사용한다.
        System.out.println(6 / 2);


        /*
            Character And String
         */
        // 자바는 문자(Character)와 문자열(String)을 구분한다.
        // 문자는 한 글자를 의미하고, 문자열은 여러개의 문자가 결합한 것을 의미한다.
        // 자바에서는 '(작은 따옴표)로 감싸야 한다.
        System.out.println('생');

        // 문자열은 "(큰따옴표)로 감싸야 한다.
        System.out.println("생활코딩");

        // 만약 문자열을 작은 따옴표로 감싸면 에러가 발생한다.
        // System.out.println('생활코딩'); error

        // 하나의 문자를 큰 따옴표로 감싼다고 에러가 발생하지는 않는다.
        // 한 글자도 문자열이 될 수 있 기 때문이다.
        System.out.println("생");


        /*
            Escape
         */

        // System.out.println("egoing said "Welcome programming world""); Error

        System.out.println("egoing said \"Welcome programming world\"");
        // \를 "앞에 위치시키면 " 를 문자열의 시작과 끝을 구분하는 구분자가 아니라 단순히 문자로 해석하도록
        // 강제할 수 있다. 이러한 기법을 escape라고 한다. 즉 큰 따옴표가 가진 문법적인 역할에서 도망(escape)
        // 쳐서 문자로 인식하도록 한다는 의미이다.

        // 여러 줄의 표시
        System.out.println("HTML\nCSS\nJAVASCRIPT\n");

        // 문자의 연산
        System.out.println("생활" + "코딩");
    }
}
