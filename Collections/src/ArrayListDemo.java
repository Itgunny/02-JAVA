import java.util.ArrayList;

/**
 * Created by gunny on 2017. 7. 12..
 *
 * 컬렉션즈 프레임워크라는 것은 컨테이너라고 부른다.
 *
 * 즉, 담는 그릇이라는 의미이다.
 *
 * Collection과 Map이라는 최상위 카테고리가 있고, 그 아래에 다양한 컬렉션들이 존재한다.
 *
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류 발생
        for(int i = 0; i < arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

        ArrayList al = new ArrayList();

        al.add("one");
        al.add("two");
        al.add("three");


        for(int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }
}
