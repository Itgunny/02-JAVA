/**
 * Created by gunny on 2017. 6. 19..
 * else if절을 이용하면 조건문의 흐름을 좀 더 자유롭게 제어할 수 있다.
 * if 절의 값이 true라면 then절이 실행된다. false라면 else if절로 제어가 넘어간다.
 * else if절의 값이 true라면 else if then절이 실행된다. false라면 else절이 실행된다.
 * else if절은 여러 개가 복수로 등장할 수 있고, else절은 생략이 가능하다. else 절이 else if절보다 먼저 등장
 * 할수 없다.
 */
public class ElseDemo {
    public static void main(String[] args) {
        // 2
        if(false) {
            System.out.println(1);
        } else if(true) {
            System.out.println(2);
        } else if(true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

        // 3
        if(false) {
            System.out.println(1);
        } else if(false) {
            System.out.println(2);
        } else if(true) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }

        // 4
        if(false) {
            System.out.println(1);
        } else if(false) {
            System.out.println(2);
        } else if(false) {
            System.out.println(3);
        } else {
            System.out.println(4);
        }
    }
}
