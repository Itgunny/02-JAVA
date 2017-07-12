/**
 * Created by gunny on 2017. 7. 11..
 *
 * 변하지 않는 값인 상수값에 따라서 그 값에 해당하는 과일의 의미를 고정하고 있다.
 */
public class ConstantDemo {
    private final static int APPLE = 1;
    private final static int PEACH = 2;
    private final static int BANANA = 3;

    // 프로그램이 커지면서 누군가 기업에 대한 상수가 필요해졌다.
    /*
        과일 APPLE과 기업 APPLE이 서로 같은 이름을 가진다.
        다행인 것은 final로 선언했기 때문에 컴파일 되지 않고 이름이 중복되는 문제를 방지할 수 있다.
     */
    private final static int GOOGLE = 1;
    //private final static int APPLE = 2;
    private final static int ORACLE = 3;
    public static void main(String[] args) {
        int type = APPLE;
        switch (type) {
            case APPLE:
                System.out.println(57 + "kcal");
                break;
            case PEACH:
                System.out.println(34 + "kcal");
                break;
            case BANANA:
                System.out.println(93 + "kcal");
                break;
        }
    }
}
