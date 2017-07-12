package org.opentutorials.javatutorials.packages.example2;
import org.opentutorials.javatutorials.packages.example1.A;

/**
 * Created by gunny on 2017. 7. 10..
 *
 * 서로 다른 패키지에 있는 클래스를 가져오려면 import를 통해서 다른 패키지의 클래스를 현재의 소스코드로 불러와야한다.
 * 만약 특정 패키지에 있는 모든 클래스를 로드하고 싶다면 * 를 사용하면된다.
 */
public class B {
    public static void main(String[] args) {
        A a = new A();
    }
}
