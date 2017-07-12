/**
 * Created by gunny on 2017. 7. 10..
 *
 * 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면, 그 객체는 반드시 인터페이스의 메소드들을 구현해야한다.
 *
 * 만약 인터페이스에서 강제하고 있는 메소드를 구현하지 않으면 이 어플리케이션은 컴파일 조차 되지 않는다.
 */
interface I1 {
    public void x();
}

interface I2 {
    public void z() ;
}

interface I3 {
    public void x();
}
// 인터페이스도 상속이 된다.
interface I4 extends I3 {
    public void z();
}

// 하나의 클래스가 여러개의 인터페이스를 구현할 수 있다.
public class A implements I1, I2 {

    // class A는 인터페이스 I를 구현한다.
    public void z() {}


    public void x() {}
}

class B implements I4 {
    public void x() {}
    public void z() {}
}

// 인터페이스의 멤버는 반드시 public이다
interface I5 {
    //private void x(); // error가 발생한다.
}

// abstract vs interface
/*
    인터페이스와 추상클래스는 서로 비슷한 듯 다른 기능이다. 인터페이스는 클래스가 아닌 인터페이스라는 고유한
    형태를 가지고 있는 반면 추상 클래스는 일반적인 클래스이다. 또 인터페이스는 구체적인 로직이나 상태를 가지고
    있을 수 없고, 추상 클래스는 구체적인 로직이나 상태를 가지고 있을 수 있다.
 */