/**
 * Created by gunny on 2017. 7. 11..
 */
class A{
    public String x() { return "x"; }
}
class B extends A{
    public String x() { return "B.x"; }
    public String y() { return "y"; }
}

class B2 extends A {
    public String x() { return "B2.x"; }
}

public class PolymorphismDemo1 {
    public static void main(String[] args) {
         A obj = new B();
        // -> 클래스 B의 데이터 형을 클래스 A로 하면 클래스 B는 마치 클래스 A인것처럼 동작하게
        // 되는 것이다. 클래스 B를 사용하는 입장에서는 클래스 B를 A인 것처럼 사용한다.
        //B obj = new B();

        /* 1. 클래스 B의 데이터 타입을 클래스 A로 인스턴스화 했을 때 클래스 B의 메소드 y는 마치 존재하지
           않는 것처럼 실행되지 않았다. => 클래스 B가 A화 되었다.

           2. 클래스 B의 데이터 타입은 클래스 A로해서 인스턴스화 했을 때 클래스 B의 메소드 x를 실행하면 클래스
           A에서 정의된 메소드가 아니라 클래스 B에서 정의된 메소드가 실행 되었다.=> 클래스 B의 기본적인 성질은
           그대로 간직하고 있다.

        */
        A obj2 = new B2();

        // 두 인스턴스 메소드 x를 호출한 결과는 서로 다르다.
        // 이것이 상속과 오버라이딩 그리고 형변환을 이용한 다형성이다.
        System.out.println(obj.x());
        System.out.println(obj2.x());
    }
}
