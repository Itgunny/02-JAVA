/**
 * Created by gunny on 2017. 7. 11..
 *
 * equals는 객체와 객체가 같은 것인지를 비교하는 API이다. 객체 간에 같고 다름은 필요에 따라서 달라질 수 있기 때문이다.
 *
 * 1. 객체 간에 동일성을 비교하고 싶을 때는 ==를 사용하지 말고 equals를 이용하자
 * 2. equals를 직접 구현해야 한다면 hashCode도 함께 구현해야 함을 알고 이에 대한 분명한 학습 한 후에 구현하자.
 * 3. equals를 직접 구현해야 한다면 eclipse와 같은 개발도구들은 equals와 hashCode를 자동으로 생성해주는 기능을
 *    가지고 있다. 이기능을 이용하는 것을 고려해보자.
 * 4. 그 이유가 분명하지 않다면 비교 연산자 == 원시 데이터형을 비교할 때만 사용하자.
 */
class Student implements Cloneable{
    String name;
    Student(String name) {
        this.name = name;
    }

    /*
        객체가 논리적으로는 egoing이라는 값을 가지고 있기 때문에 객체를 만든 필자는
        저 두개의 객체가 같은 객체로 간주되었으면 좋겟다.
        이럴 때 클래스 Object의 메소드 equals를 overriding하면 된다.


     */
    public boolean equals(Object obj) {
        // 위의 코드 (Student) obj는 메소드 eqauls로 전달된 obj의 데이터 타입이 Object이기 때문에 이를
        // Student type으로 변환하는 코드이다.
        Student _obj = (Student) obj;
        return name == _obj.name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        try {
            Student s2 = (Student) s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
            System.out.println(s1 == s2);
            System.out.println(s1.equals(s2));
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
