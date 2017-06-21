/**
 * Created by gunny on 2017. 6. 19..
 * + 연산자는 숫자와 숫자를 더할 때 사용되지만, 문자열과 문자열을 결합할 때도 사용된다.
 *
 */

public class ConcatDemo {
    public static void main(String[] args) {
        String firstString = "This is ";
        String secondString = "a concatenated string.";
        String thirdString = firstString + secondString;

        System.out.println(thirdString);

        // This is a concatenated string.
    }
}
