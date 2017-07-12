import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by gunny on 2017. 7. 12..
 */
class Computer implements Comparable {
    int serial;
    String owner;
    Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }

    public int compareTo(Object o) {
        return this.serial - ((Computer)o).serial;
    }
    public String toString() {
        return serial + " " + owner;
    }
}
public class CollectionsDemo {
    private static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphittie"));

        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()) {
            System.out.println(i.next());
        }
        /*
         * sort의 인자인 list는 데이터 타입이 List이다. 즉, 메소드 sort는 List형식의 컬렉션을 지원한다는 것을 알 수 있다.
         * 인자 list의 제네릭 <T>는 comparable을 extends하고 있어야 한다. Comparable은 인터페이스인데 이를 구현하고 있는
         * 클래스는 compareTo(T o) 메소드를 가지고 있어야 한다.
         */
        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
