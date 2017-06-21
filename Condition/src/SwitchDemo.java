/**
 * Created by gunny on 2017. 6. 19..
 * 조건문의 대표적인 문법은 if문이다. 사용빈도는 적지만 조건이 많다면 switch문이 로직을 보다 명료하게 보여 줄 수 있다.
 *
 * Switch 문을 사용할 때 한가지 주의 할 것은 switch의 조건으로는 몇가지 제한된 데이터 타입만을 사용할 수 있다.
 * byte, short, char, int, enum, String, Character, Byte, Short, Integer
 */
public class SwitchDemo {
    public static void main(String[] args) {

        System.out.println("switch(1)");
        switch(1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(2)");
        switch(2){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(3)");
        switch(3) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }

        System.out.println("switch(4)");

        switch(4) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
