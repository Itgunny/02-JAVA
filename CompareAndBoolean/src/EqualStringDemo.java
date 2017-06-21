/**
 * Created by gunny on 2017. 6. 19..
 */
public class EqualStringDemo {
    public static void main(String[] args) {
        /*
            ==은 두개의 데이터 타입이 동일한 객체인지를 알아내기 위해서 사용되는 연산자.
            .equals : 서로 다른 객체들간에 값이 같은지를 비교할 수 있다.
         */
        String a = "Hello world";
        String b = new String("Hello world");

        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
    }
}
