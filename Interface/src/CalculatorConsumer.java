/**
 * Created by gunny on 2017. 7. 10..
 */
class CalculatorDummy implements Calculatable{
    public void setOperands(int first, int second, int third) {}
    public int sum() {
        return 60;
    }
    public int avg() {
        return 20;
    }
}

class Calculator implements Calculatable{
    int left, right, third;
    public void setOperands(int left, int right, int third) {
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public int sum() {
        return this.left + this.right + this.third;
    }

    public int avg() {
        return (this.left + this.right + this.third) / 3;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperands(10, 20, 30);
        System.out.println(c.sum() + c.avg());
    }
}
