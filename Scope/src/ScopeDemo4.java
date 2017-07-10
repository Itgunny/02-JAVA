/**
 * Created by gunny on 2017. 7. 6..
 */
public class ScopeDemo4 {

    /*
        지역변수가 메소드 내에서만 접근이 가능함을 보여준다.
     */
    static void a() {
        String title = "coding everybody";
    }

    public static void main(String[] args) {
        a();
        // System.out.println(title); error
    }
}
