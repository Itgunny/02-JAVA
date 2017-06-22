/**
 * Created by gunny on 2017. 6. 22..
 *
 * 객체를 만들기 전에 이미 익숙한 코드로 돌아가보자. 아래 예제는 간단한 더하기 프로그램이다. 그런데 이 예제를 잘
 * 활용하기 위해서는 상상력이 필요한다. 아주 간단한 예제지만 상당히 복잡한 작업을 실행하고 있는 로직으로 가정하자.
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(20 + 40);

        sum(10, 20);
        sum(20, 40);

        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        left = 20;
        right = 40;

        sum(left, right);
        avg(left, right);
    }
    /*
        프로그래밍의 기본은 중복을 제거하는 것이다. 위의 로직은 두개의 값을 더하는 중복이 존재.
        따라서 중복을 제거하기 위해 고려해볼 수 있는 기능이 메소드다.
        로직을 메소드로 만들면 코드의 양을 줄일 수 있고, 문제가 생겼을 때 원인을 더쉽게 찾을 수 있다.
     */
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
}
