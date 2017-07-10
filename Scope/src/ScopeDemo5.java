/**
 * Created by gunny on 2017. 7. 6..
 */
public class ScopeDemo5 {

    public static void main(String[] args) {

        // for문 안에서 선언된 변수도 지역변수이므로 포문 밖에서는 사용되지 못한다.
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i)
    }
}
