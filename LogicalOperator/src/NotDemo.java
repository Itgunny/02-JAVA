/**
 * Created by gunny on 2017. 6. 21..
 */
public class NotDemo {

    public static void main(String[] args) {
        // !는 부정의 의미로 not이라고 읽는다. Boolean의 값을 역전 시키는 역할을 한다.
        if(!true) {
            System.out.println(1);
        }
        if(!false) {
            System.out.println(2);
        }
    }
}
