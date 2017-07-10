/**
 * Created by gunny on 2017. 7. 6..
 */
public class ScopeDemo2 {

    // Class Variable
    static int i;

    // 클래스 소속의 변수가 되면 모든 메소드에서 접근할 수 있다.
    static void a() {
        i = 0;
    }

    public static void main(String[] args) {
        // 따라서 반복문이 멈추지 않음.
        for(i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
}



