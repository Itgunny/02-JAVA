/**
 * Created by gunny on 2017. 6. 19..
 */
public class DivisionDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b); // int / int 3은 몫이고 나머지는 버림.
        System.out.println(c/d); // float / float는 소숫점 표시.
        System.out.println(a/d); // int / float는 암시적 형 변환으로 인한 실수처리.
    }
}
