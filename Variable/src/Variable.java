/**
 * Created by gunny on 2017. 6. 8..
 *
 * (문자나 숫자) 데이터를 담는 컨테이너다 여기에 담겨진 데이터는 다른 데이터로 바꿀 수 있다.
 *
 * 변수는 마치 (사람이 쓰는 언어) 자연어에서 대명사와 비슷한 역할을 한다.
 *
 */
public class Variable {

    public static void main(String[] args) {
        // 변수 선언과 할당

        /*
            Integer
         */
        int a;
        a = 1;
        System.out.println(a + 1); // 2

        a = 2;
        System.out.println(a + 1); // 3

        /*
            // : 주석으로 코드에 부가적인 설명을 쓰거나 사용하지 않는 코드를 비활성화시키기 위해서
                 사용한다. 뒤에 따라오는 내용은 해석되지 않는다.
            ;  : 하나의 구분이 끝났음을 명시적으로 나타내는 기호다. 다음처럼 한줄에 여러구문을 사용
                 하고 싶을때 세미콜론이 유용하다. 자바에서는 세미콜론을 생략할 수 없다.
         */

        /*
            double
         */
        double d = 1.1;
        System.out.println(d + 1.1); // 2.2

        d = 2.1;
        System.out.println(d + 1.1); // 3.2

        // Container를 생성할 때 지정한 데이터 형식(int, double)에 맞는 데이터를 입력해야 한다.
        // int a1 = 1.1; type mismatch -> error

        /*
            String : 변수라고 해서 꼭 숫자만 오는 것이 아니다.
         */
        // 문자열을 담을 때는 위와 같이 변수의 이름 앞에 String을 붙여준다.
        String first = "coding";
        System.out.println(first + " " + "everybody");

        // 여러개의 변수(string1, string2)를 동시에 선언할 수 있다.
        String string1, string2;
        string1 = "coding";
        string2 = " everybody";
        System.out.println(string1 + string2);

        /*
            자바는 자바 스크립트에 비해 엄격한 것을 선호한다. 
         */

        /*
            변수는 코드의 재활용성을 높여준다.

         */
        System.out.println(100 + 10);
        System.out.println((100 + 10) / 10);
        System.out.println(((100 + 10) / 10) - 10);
        System.out.println((((100 + 10) / 10) - 10) * 10);

        int num = 100;
        System.out.println(num + 10);
        System.out.println((num + 10) / 10);
        System.out.println(((num + 10) / 10) - 10);
        System.out.println((((num + 10) / 10) - 10) * 10);
    }
}
