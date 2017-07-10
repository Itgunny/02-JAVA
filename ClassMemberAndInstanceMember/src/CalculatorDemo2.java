/**
 * Created by gunny on 2017. 6. 22..
 *
 * 만약 메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있다.
 */
class Calculator2 {
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void avg(int left, int right) {
        System.out.println((left + right)/ 2);
    }
}
public class CalculatorDemo2 {
    public static void main(String[] args) {
        Calculator2.sum(10, 20);
        Calculator2.avg(10, 20);

        Calculator2.sum(20, 40);
        Calculator2.avg(20, 40);
    }
}


