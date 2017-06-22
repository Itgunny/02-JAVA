/**
 * Created by gunny on 2017. 6. 21..
 *
 * 자바 5.0부터 도입된 iteration 기능
 */
public class ForeachDemo {
    public static void main(String[] args) {
        String[] members = {"최진혁", "최유빈", "한이람"};
        for(String s : members) {
            System.out.println(s + "이 상담을 받았습니다.");
        }
    }
}
