/**
 * Created by gunny on 2017. 6. 22..
 *
 * 클래스를 만드는 구성원
 * 변수
 * 메소드
 * 클래스도 멤버를 가질 수 있다.
 */
class Calculator {

    /* 모든 인스턴스가 같은 값을 공유하게 하고 싶을 때 사용.
       1. 인스턴스에 따라서 변하지 않는 값이 필요한 경우
       2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
       3. 값의 변경 사항을 모든 인스턴스가 공유해야하는 경우.
    */
    static double PI = 3.14;

    static int base = 0;

    int left, right;

    public void setOperand(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}

public class CalculatorDemo1 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperand(10, 20);
        c1.sum();
        System.out.println(c1.PI);

        Calculator c2 = new Calculator();
        c2.setOperand(20, 40);
        c2.sum();
        System.out.println(c2.PI);


        Calculator.base = 10;
        c1.sum();
        c2.sum();
        System.out.println(Calculator.PI);
    }
}
