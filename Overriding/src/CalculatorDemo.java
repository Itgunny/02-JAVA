/**
 * Created by gunny on 2017. 7. 10..
 *
 * 하위 클래스 입장에서 부모 클래스란 말하자면 기본적인 동작 방법을 정의한 것이라고 생각할 수 있다.
 *
 * 하위 클래스에서 상의 클래스와 동일한 메소드를 정의하면 부모 클래스로부터 물려받은 기본 동작 방법을 변경하는 효과를
 *
 * 갖게 된다.
 *
 * 기본 동작은 폭넓게 적용되고, 예외적인 동작은 더 높은 우선위를 갖게하고 있다.
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

    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public void sum() {
        System.out.println("실행 결과는 " + (this.left + this.right) + "입니다.");
    }

    /*overriding을 하기 위해서는 메소드의 리턴형식이 같아야 한다. 즉, 클래스 Calculator의 메소드 avg는
    리턴타입이 void이다. 그런데 이것을 상속한 클래스 SubstractionableCalculator의 리턴타입은 int이다.
    오버라이딩을 하기 위해서는 아래의 조건을 충족시켜야 한다.
        1. 메소드의 이름
        2. 메소드 매개변수의 숫자와 데이터 타입 그리고 순서
        3. 메소드의 리턴타입
    위와 같이 메소드의 형태를 정의하는 사항들을 통털어서 메소드의 서명(signature)라고 한다.*/
    public int avg() {
        return super.avg();
    }

    public void substract() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOperands(10, 20);
        c1.sum();
        System.out.println(c1.avg());
        c1.substract();
    }
}
