import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by gunny on 2017. 7. 12..
 *
 * List와 Set의 차이점은 List는 중복을 허용하고 저장 순서 유지, Set은 허용하지 않는다 순서가 없음.
 */
public class ListSetDemo {

    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();

        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        // 메소드 iterator는 인터페이스 Collection에 정의되어 있다. 따라서 Collection을 구현하고 있는 모든 컬렉션즈 프레임 워크는
        // 이메소드를 구현하고 있음을 보증한다. 메소드 iterator의 호출 결과는 인터페이스 iterator를 구현한 객체를 리턴한다.
        // hasNext : 반복할 데이터가 더 있으면 true, 더 이상 반복할 데이터가 없다면 false를 리턴한다.
        // next : hasNext가 true라는 것은 next가 리턴할 데이터가 존재한다는 의미이다.

        Iterator ai = al.iterator();
        while(ai.hasNext()) {
            System.out.println(ai.next());
        }

        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()) {
            System.out.println(hi.next());
        }

    }
}
