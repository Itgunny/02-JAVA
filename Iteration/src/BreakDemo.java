/**
 * Created by gunny on 2017. 6. 21..
 *
 * 반복작업을 중간에 중단시키고 싶다면 break를 사용하면 된다.
 *
 */
public class BreakDemo {
    public static void main(String[] args) {
        for(int i = 0; i< 10; i++) {
            if(i == 5)
                break;
            System.out.println("Coding Everybody " + i);
        }
    }
}
