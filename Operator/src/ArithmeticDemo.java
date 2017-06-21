/**
 * Created by gunny on 2017. 6. 19..
 *
 * 연산자란 특정한 작업을 하기 위해서 사용하는 기호를 의미한다. 작업의 종류에 따라서 대입 연산자, 산술 연산자, 비교 연산자,
 * 논리 연산자 등이 있다.
 */
public class ArithmeticDemo {

    public static void main(String[] args) {
        // result의 값은 3
        int result = 1 + 2;
        System.out.println(result);

        // result의 값은 2
        result = result - 1;
        System.out.println(result);

        // result의 값은 4
        result = result * 2;
        System.out.println(result);

        // result의 값은 2
        result = result / 2;
        System.out.println(result);

        // result의 값은 10
        result = result + 8;

        // result의 값은 3
        result = result % 7;
        System.out.println(result);
    }
}
