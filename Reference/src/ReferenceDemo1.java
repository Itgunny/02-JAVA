/**
 * Created by gunny on 2017. 7. 12..
 * 자바에서는 기본데이터 형을 제외한 모든 데이터 타입은 참조 데이터형이라고 부른다.
 * 기본 데이터형은 위와 같이 복제되지만 참조 데이터형은 참조된다.
 *
 */
class A {
    public int id;
    A(int id) {
        this.id = id;
    }
}
public class ReferenceDemo1 {

    // Call by Value -> 값이 복사.
    public static void runValue() {
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue" + a);
    }
    // Call by Reference -> 참조가 복사
   public static void runReference() {
        A a = new A(1);
        A b = a;
        b.id = 2;
        System.out.println("runReference, " + a.id);
    }
    public static void main(String[] args) {
        runValue();
        runReference();
    }
}
