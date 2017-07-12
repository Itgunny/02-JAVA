import jdk.nashorn.internal.runtime.regexp.joni.constants.CCSTATE;

/**
 * Created by gunny on 2017. 7. 10..
 */

class Calculator {
    int left, right;

    public Calculator() { }

    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
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

    public SubstractionableCalculator(int left, int right) {
        super(left, right);
    }

    public void substact() {
        System.out.println(this.left - this.right);
    }
}
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substact();
    }
}
