/**
 * Created by gunny on 2017. 7. 11..
 *
 * toString : 객체를 문자로 표현하는 메소드이다.
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

    @Override
    public String toString() {
        return "left : " + this.left + ", right : " + this.right;
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 20);
        System.out.println(c1);
        System.out.println(c1.toString());
    }
}
