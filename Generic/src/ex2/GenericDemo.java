package ex2;

/**
 * Created by gunny on 2017. 7. 12..
 * 제네릭으로 올 수 있는 데이터 타입을 특정클래스의 자식으로 제한할 수 있다.
 * extends는 상속(extends)뿐 아니라 구현(implements)의 관계에서도 사용할 수 있다.
 */


abstract class Info {
    public abstract int getRank();
}
class EmployeeInfo extends Info {
    public int rank;
    EmployeeInfo(int rank ) {
        this.rank = rank;
    }
    public int getRank() {
        return this.rank;
    }
}

class Person<T extends Info> {
    public T info;
    Person(T info) { this.info = info; }
}

public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
        //Person<String> p2 = new Person<String>("부장"); String은 Infor를 상속받지않으므로 사용할 수 없음.
    }
}
