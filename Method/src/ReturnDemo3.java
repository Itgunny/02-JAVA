/**
 * Created by gunny on 2017. 6. 22..
 *
 * 메소드는 여러개의 입력 값을 가질 수 있다.
 * 하지만 출력 값을 하나밖에 못갖는다.
 *
 * 하나의 변수에 여러개의 값을 담아서 출력하면 된다.
 */
public class ReturnDemo3 {
    public static String getMember1() {
        return "최진혁";
    }

    public static String getMember2() {
        return "최유빈";
    }

    public static String getMember3() {
        return "한아람";
    }

    public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }
}
