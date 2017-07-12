package ex1;

/**
 * Created by gunny on 2017. 7. 12..
 *
 * 제네릭(Generic)은 클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법을 의미한다.
 *
 * 즉, 클래스를 정의할 떄는 info의 데이터 타입을 확정하지 않고 인스턴스를 생성할 때 데이터 타입을 지정하는 기능이
 * 제네릭이다.
 */

class Person1<T> {
    public T info;
}
public class GenericDemo {

    public static void main(String[] args) {
        Person1<String> p1 = new Person1<String>();
        Person1<StringBuilder> p2 = new Person1<StringBuilder>();
    }
}
