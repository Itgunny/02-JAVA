/**
 * Created by gunny on 2017. 6. 21..
 */
public class OrDemo {
    public static void main(String[] args) {
        // ||(or)는 좌우항 중에 하나라도 true라면 전체가 true되는 논리연산자다.
        if(true || true) {
            System.out.println(1);
        }

        if(true || false) {
            System.out.println(2);
        }

        if(false || true) {
            System.out.println(3);
        }

        if(false || false) {
            System.out.println(4);
        }
    }
}
