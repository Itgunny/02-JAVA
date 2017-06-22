/**
 * Created by gunny on 2017. 6. 22..
 *
 * 객체 지향의 핵심은 연관되어 있는 변수와 메소드를 하나의 그룹으로 묶어서 그룹핑하는 것이다.
 * 이것들을 그룹핑해서 하나의 부품으로 만들면 필요할 때마다 반복적으로 사용할 수 있을 것이다.
 */

// 클래스는 연관되어 있는 변수와 메소드의 집합이다.
class Calculator {
    int left, right;

    public void setOperand(int left, int right) {
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
public class CalculatorDemo2 {
    public static void main(String[] args) {
        /* 클래스는 일종의 설계도다. 클래스를 정의하는 것 자체로는 할 수 있는 일이 많지 않다.
           설계도를 구체적인 제품으로 만들어야한다.
           인스턴스 : 제품

           클래스를 만든다는 것은 사용자 정의 데이터 타입을 만드는 것과 같은 의미다.
           클래스를 인스턴스화 할때는 변수에 담아야 한다는 것과 이 때 사용하는 변수의 데이터 타입은 그 클래스가 된다는 점이다.
           변수 : State
           메소드 : Behave

           즉, 하나의 클래스를 바탕으로 서로 다른 상태를 가진 인스턴스를 만들면
           서로 다른 행동을 하게 된다는 것을 알 수 있다.
         */

        Calculator c1 = new Calculator();
        c1.setOperand(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.sum();
        c2.avg();
    }
}
