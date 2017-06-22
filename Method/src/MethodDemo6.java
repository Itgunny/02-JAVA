import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by gunny on 2017. 6. 22..
 */
public class MethodDemo6 {
    public static String numbering(int init, int limit) {
        int i = init;
        // 만들어지는 숫자들을 output이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";

        while(i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;
            i++;
        }
        // output에 담겨 있는 문자열을 메소드 외부로 반화하려면 아래와 같이 return
        return output;
    }

    public static void main(String[] args) {
        // 메소드 numbering이 리턴한 변수 result에 담긴다.
        String result = numbering(1, 5);
        // 변수 result의 값을 화면에 출력한다.
        System.out.println(result);
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
