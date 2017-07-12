import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by gunny on 2017. 7. 12..
 */


public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        System.out.println(A.containsAll(B)); // 부분 집합
        System.out.println(A.containsAll(C)); // 부분 집합

        //A.addAll(B); // 합집합
        //A.retainAll(B); // 교집합
        //A.removeAll(B); // 차집합

        Iterator hi = A.iterator();
        while(hi.hasNext()) {
            System.out.println(hi.next());
        }
    }
}
