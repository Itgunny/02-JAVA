/**
 * Created by gunny on 2017. 7. 6..
 *
 * 유효범위는 암시적인 기능이라고 할 수 있기 때문에 자연스럽게 알게 되는 부분이다.
 *
 */
public class ScopeDemo {

    /*
        함수 지역변수 내의 i와 유효범위가 동일하지 않는 것을 보여주는 예제
     */
    static void a() {
        int i = 0;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}
