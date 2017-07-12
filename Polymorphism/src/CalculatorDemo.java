/**
 * Created by gunny on 2017. 7. 11..
 */

abstract class Calculator {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int _sum() {
        return this.left + this.right;
    }

    public abstract void sum();
    public abstract void avg();
    public void run() {
        sum();
        avg();
    }
}

class CalculatorDecoPlus extends Calculator {
    public void sum() {
        System.out.println("+ sum : " + _sum());
    }
    public void avg() {
        System.out.println("+ avg : " + (this.left + this.right) / 2);
    }
}

class CalculatorDecoMinus extends Calculator {
    public void sum() {
        System.out.println("- sum : " + _sum());
    }
    public void avg() {
        System.out.println("- avg : " + (this.left + this.right) / 2);
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new CalculatorDecoPlus();
        c1.setOperands(10, 20);

        Calculator c2 = new CalculatorDecoMinus();
        c2.setOperands(10, 20);

        execute(c1);
        execute(c2);
    }

    public static void execute(Calculator cal) {
        System.out.println("실행결과");
        cal.run();
    }
}
