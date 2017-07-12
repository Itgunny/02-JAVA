/**
 * Created by gunny on 2017. 7. 11..
 *
 * 접미사로 이름을 구부했던 부분이 인터페이스로 구분되기 때문에 언어의 특성을 보다 잘 살린 구조가 되었다.
 * 인터페이스를 이렇게 사용할 수 있는 것은 인터페이스에서 선언된 변수는 무조건 public static final의 속성을
 * 갖기 때문이다.
 *
 * 문제점 : type의 값을 누군가 COMPANY_GOOGLE을 사용하면 안된다.
 */
interface FRUIT {
    int APPLE=1, PEACH=2, BANANA=3;
}
interface COMPANY {
    int GOOGLE=1, APPLE=2, COMPANY_ORACLE=3;
}
public class ConstantDemo2 {
    private final static int FRUIT_APPLE = 1;
    private final static int FRUIT_PEACH = 2;
    private final static int FRUIT_BANANA = 3;

    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;
    public static void main(String[] args) {
        int type = FRUIT.APPLE;
        switch (type) {
            case FRUIT.APPLE:
                System.out.println(57 + "kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34 + "kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93 + "kcal");
                break;
        }
    }
}
