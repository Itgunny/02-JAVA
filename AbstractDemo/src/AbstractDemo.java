/**
 * Created by gunny on 2017. 7. 10..
 */
abstract class A {

    public abstract int b();

    // abstract에는 추상메소드가 아닌 메소드가 존재할 수 있다.
    public void d() {
        System.out.println("world");
    }
}

class B extends A {
    public int b() { return 1; }
}

public class AbstractDemo {
    public static void main(String[] args) {
        // 추상클래스는 구체적인 메소드의 내용이 존재하지 않기 때문에 인스턴스화 시켜서 사용할 수 없기 때문이다.
        //A obj = new A();
        // 클래스 B는 클래스 A를 상속했다. 그리고 클래스 A의 추상 메소드인 메소드 b를 오버라이딩 하고 있다.
        // 그 결과 클래스 A를 사용할 수 있었다.
        B obj = new B();
        System.out.println(obj.b());
    }
}
