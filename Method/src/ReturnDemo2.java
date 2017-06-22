/**
 * Created by gunny on 2017. 6. 22..
 *
 * return은 메소드를 종료시키는 역할을 하므로 return이 처음 등장한 이후의 구문은 실행되지 않기 때문이다.
 */
public class ReturnDemo2 {
    public static String num(int i) {
        if(i == 0) {
            return "zero";
        } else if(i == 1) {
            return "one";
        } else if(i == 2) {
            return "two";
        }
        return "none";
    }

    public static void main(String[] args) {
        System.out.println(num(1));
    }
}
