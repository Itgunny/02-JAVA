/**
 * Created by gunny on 2017. 7. 10..
 *
 * 같은 패키지, 같은 클래스 : public, protected, default, private
 * 같은 패키지, 상속 관계 : public, protected, defualt
 * 같은 패키지, 상속 관계 : public, protected, defualt
 * 다른 패키지, 상속 관계 : public, protected
 * 다른 패키지, 상속 관계 아님 : public
 */

class Calculator {
    private int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    // 어떤 멤버에 대한 접근을 허용할 것인가를 설정해줘야한다.

    private int _sum() {
        return this.left + this.right;
    }

    public void sumDecoPlus() {
        System.out.println("++++" + _sum() + "++++");
    }

    public void sumDecoMinus() {
        System.out.println("----" + _sum() + "----");
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        c1.sumDecoPlus();
        c1.sumDecoMinus();
    }
}
