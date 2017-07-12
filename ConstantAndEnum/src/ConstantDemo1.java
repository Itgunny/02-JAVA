/**
 * Created by gunny on 2017. 7. 11..
 *
 * 접두사를 붙여 이름이 중복되는 것을 방지할 수 있다.
 *
 * 이러한 기법을 네임 스페이스라고 한다. 그런데 상수가 너무 지저분하다 좀 깔끔하게 바꿀수 없을까?
 */
public class ConstantDemo1 {
    private final static int FRUIT_APPLE = 1;
    private final static int FRUIT_PEACH = 2;
    private final static int FRUIT_BANANA = 3;

    private final static int COMPANY_GOOGLE = 1;
    private final static int COMPANY_APPLE = 2;
    private final static int COMPANY_ORACLE = 3;
    public static void main(String[] args) {
        int type = FRUIT_APPLE;
        switch (type) {
            case FRUIT_APPLE:
                System.out.println(57 + "kcal");
                break;
            case FRUIT_PEACH:
                System.out.println(34 + "kcal");
                break;
            case FRUIT_BANANA:
                System.out.println(93 + "kcal");
                break;
        }
    }
}
