/**
 * Created by gunny on 2017. 7. 11..
 */
interface I2 {
    public String A();
}

interface I3 {
    public String B();
}

class D implements I2, I3 {
    public String A() {
        return "A";
    }

    public String B() {
        return "B";
    }
}

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        /*
            인스턴스 objI2의 데이터 타입을 I2로 한다는 것은 인스턴스를 외부에서
            제어할 수 있는 조작 장치를 인스턴스 I2의 멤버로 제한한다는 의미가 된다.

         */
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        obj.A();
        obj.B();

        objI2.A();
        // objI2.B();

        // objI3.B();
        objI3.B();
    }
}
