/**
 * Created by gunny on 2017. 6. 22..
 *
 * 인스턴스 변수 -> Non-Static Field
 * 클래스 변수 -> Static Field
 */
public class ClassMemberDemo {
    public static void main(String[] args) {
        C1 c = new C1();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공
        c.staticStatic();

        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패
        c.staticInstance();

        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공
        c.instanceStatic();

        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
        c.instanceInstance();

        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공
        C1.staticStatic();

        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패
        C1.staticInstance();

        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instanceStatic();

        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instanceInstance();

    }
}

class C1 {
    static int staticVariable = 1;
    int instanceVariable = 2;

    static void staticStatic() {
        System.out.println(staticVariable);
    }

    static void staticInstance() {
        // 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
        // System.out.println(instanceVariable);
    }

    void instanceStatic() {
        // 인스턴스 메소드에서 클래스 변수에 접근 할 수 있다.
        System.out.println(staticVariable);
    }

    void instanceInstance() {
        System.out.println(instanceVariable);
    }
}


