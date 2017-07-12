/**
 * Created by gunny on 2017. 7. 11..
 *
 * 프로그래밍을 하면 많은 오류 상황에 직면하게 된다.
 * 예외란 프로그램을 만든 프로그래머가 상정한 정상적인 처리에서 벗어나는 경우 이를 처리하기 위한 방법이다.
 * 예기치 못한 오류를 처리하는 방법이다.
 */

class DivideException extends RuntimeException {
    DivideException() {
        super();
    }
    DivideException(String message) {
        super(message);
    }
}
class Calculator {
    int left, right;
    public void setOperands(int left, int right) {

        this.left = left;
        this.right = right;
    }

    public void divide() {
        /*
            throw는 예외를 발생시키는 명령이다. throw 뒤에는 예외 정보를 가지고 있는 예외클래스가 위치한다.
            자바 가상 머신은 이 클래스를 기준으로 어떤 catch 구문을 실행할 것인지 결정한다.
            또 실행되는 catch 구문에서는 예외 클래스를 통해서 예외 상황의 원인에 대한 다양한 정보를 얻을 수 있다.
          */
        if(this.right == 0) {
            try {
                throw new DivideException("두번째 인자의 값은 0이 될 수 없습니다.");
            } catch(DivideException e) {
                e.printStackTrace();
            }
        }
        // try 안에는 예외 상황이 발생할 것으로 예상되는 로직을 위치 시킨다.
        /*try {
            System.out.print("계산결과는 ");
            System.out.print(this.left / this.right);
            System.out.print(" 입니다.");
            // catch 안에는 예외가 발생했을 때 뒷수습을 하기 위한 로직이 위치한다.
        } catch(Exception e) {
            // 오류에 대한 기본적인 내용을 출력해준다.
            System.out.println("e.getMessage() : " + e.getMessage());
            System.out.println("e.toString() : " + e.toString());
            System.out.println("e.printStackTrace()");
            e.printStackTrace();
        }*/
        System.out.print(this.left / this.right);

    }

}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOperands(10, 0);
        try {
            c1.divide();
        } catch(DivideException e) {
            e.printStackTrace();
        }

        /*Calculator c2 = new Calculator();
        c2.setOperands(10, 5);
        c2.divide();*/
    }
}
