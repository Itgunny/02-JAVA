/**
 * Created by gunny on 2017. 6. 19..
 */
public class CommentAndSemicolon {

    public static void main(String[] args) {

        /*
            주석은 로직에 대한 설명이나 코드를 비활성화 할 때 사용한다.
            주석은 프로그래밍적으로 해석되지 않는다.
         */

        // 두개의 변수가 같은 데이터 타입 일 때 아래와 같이 코드를 작성한다.
        String a, b;

        // 여러줄 주석
        /*
            a = "coding";
            b = "everybody";
            System.out.println(a + b);
         */

        /* JavaDoc 주석
            /** 로 시작하는 주석은 JavaDoc 주석이라고 해서 자바의 문서를 만들 때 사용한다.
         */

        /*
            세미콜론 : 문장의 끝을 의미한다. 자바에서는 문장의 끝에 세미콜론을 사용하지 않으면
            컴파일 에러가 발생한다.
         */

        // assignment statement
        double aValue = 8933.234;

        // increment statement
        aValue++;

        // method invocation statement
        System.out.println("Hello World");

        //object creation statement
        int c = 100; double d = 10.1;
    }
}
