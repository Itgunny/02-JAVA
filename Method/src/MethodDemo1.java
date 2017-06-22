/**
 * Created by gunny on 2017. 6. 22..
 * 직접 메소드를 만드는 것을 정의라고하고
 * 만들어진 메소드를 실행하는 것을 호출이라고한다.
 * (재활용성)
 *
 * main 메소드는 규칙이다. 만들고 싶은 프로그램이 있다면 main을 만들어야하는 약속이 있다.
 *
 *
 */
public class MethodDemo1 {
    // 정의
    public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // 호출
        numbering();
    }
}
