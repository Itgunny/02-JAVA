/**
 * Created by gunny on 2017. 7. 10..
 *
 * 객체를 사용하는 입장에서 객체를 내부적으로 사용하는 변수나 메소드에 접근함으로서 개발자가 의도하지 못한
 * 오동작을 일으키게 된다.
 *
 * 위와 같은 문제로부터 객체의 로직을 보호하기 위해서는 멤버에 따라서 외부의 접근을 허용하거나 차단 해야할
 * 필요가 생긴다.
 */
class A {
    public String y() {
        return "public void y()";
    }

    private String z() {
        return "public void z()";
    }

    public String x() {
        return z();
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        // System.out.println(a.z());

        // 접근 제어자가 public이기 때문에 호출할 수 있다. 그리고 메소드의 내용을 보면 내부적으로 메소드 z를
        // 호출하고 있다. 메소드 z는 정상적으로 호출된다. 왜냐하면 메소드 x와 메소드 z는 같은 클래스의 소속이기
        // 때문이다.
        System.out.println(a.x());
    }
}
