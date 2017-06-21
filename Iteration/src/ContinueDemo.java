/**
 * Created by gunny on 2017. 6. 21..
 *
 * 실행을 즉시 중단하면서 반복은 지속해가게 하려면 continue를 사용한다.
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            if(i == 5) {
                continue;
            }
            System.out.println("Coding Everybody " + i);
        }
    }
}
