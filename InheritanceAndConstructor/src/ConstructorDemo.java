/**
 * Created by gunny on 2017. 7. 10..
 *
 * 기본 생성자 : 생성자를 사용하지 않을 때 자동으로 빈 파라미터의 생성자를 만들어 준다.
 *
 * 매개 변수가 있는 생성자가 있을 때는 자동으로 기본 생성자를 만들어주지 않는다.
 * 따라서 기본생성자를 추가해줘야 한다.
 */
public class ConstructorDemo {
    public ConstructorDemo() {}
    public ConstructorDemo(int param1) {}
    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo();
    }
}
