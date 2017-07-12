/**
 * Created by gunny on 2017. 7. 11..
 *
 * 특정한 인터페이스를 구현하고 있는 클래스가 있을 때 이 클래스의 데이터 타입으로 인터페이스를
 * 지정할 수 있다.
 */
interface I{}
class C implements I{}

public class PolymorphismDemo2 {
    public static void main(String[] args) {
        I obj = new C();
    }
}
