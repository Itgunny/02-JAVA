/**
 * Created by gunny on 2017. 7. 11..
 * 다형성이란 하나의 메소드나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것을 의미한다.
 *
 * 클래스 O는 메소드 a는 두개의 본체를 가지고 있다. 동시에 두개의 본체는 하나의 이름인 a를 공유하고 있다.
 * 같은 이름이지만 서로 다른 동작 방법을 가지고 있기 때문에 오버로딩은 다형성의 한 예라고 할 수 있다.
 */

class O {
    public void a(int param) {
        System.out.println("Print Number");
        System.out.println(param);
    }
    public void a(String param) {
        System.out.println("Print String");
        System.out.println(param);
    }
}
public class PolymorphismOverloadingDemo {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
