import java.net.CacheRequest;

/**
 * Created by gunny on 2017. 7. 10..
 *
 * 객체지향을 통해서 달성하고자 하는 목표 중에서 가장 중요한 것은 재활용성일 것이다.
 * 상속은 객체지향의 재활용성을 극대화시킨 프로그래밍 기법이라고 할 수 있다.
 * 동시에 객체지향을 복잡하게 하는 주요 원인이라고도 할 수 있다.
 *
 * 상속이란 물려준다는 의미다. 어떤 객체가 있을 때 그 객체의 필드와 메소드를 다른 객체가
 * 물려 받을 수 있는 기능을 상속이라고 한다.
 *
 * 부모클래스와 자식클래스의 관계를 상위 클래스와 하위 클래스라고 표현하기도 한다.
 * 또한 기초 클래스, 유도 클래스라고도 부른다.
 */

class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}


public class CalculatorDemo1 {

    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }

}
