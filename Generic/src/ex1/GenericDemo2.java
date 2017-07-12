package ex1;

/**
 * Created by gunny on 2017. 7. 12..
 *
 * 제네릭은 참조 데이터 타입에 대해서만 사용할 수 있다.
 * 기본 데이터 타입에서는 사용할 수 없다.
 */

class Person2<T, S> {
    public T info;
    public S id;
    Person2(T info, S id) {
        this.info = info;
        this.id = id;
    }
    // 제네릭은 메소드에 적용할 수도 있다.
    public <U> void printInfo(U Info) {
        System.out.println(info);
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10); // int를 참조 데이터 타입으로 변환해주는 역할 (Wrapper)
        Person2<EmployeeInfo, Integer> p1 = new Person2<EmployeeInfo, Integer>(new EmployeeInfo(1), 1);
        System.out.println(p1.id.intValue());
        p1.<EmployeeInfo>printInfo(e);
        p1.printInfo(e);
    }

}
