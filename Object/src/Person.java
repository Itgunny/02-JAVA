import java.util.HashMap;
import java.util.Map;

/**
 * Created by gunny on 2017. 7. 11..
 *
 * eqauls는 두 객체의 내용이 같은지, 동등성을 비교하는 연산자
 *
 * equals와 관련된 규약
 * 1. 반사성 (자신과의 동치성 비교시 equals true)
 * 2. 대칭성 (a.equals(b) == true 이면 b.equals(a) == true)
 * 3. 추이성 (a.equals(b) == true, b.equals(c) == true 이면 a.equals(c) = true)
 * 4. 일관성 (equals 비교 횟수와 시점에 상관없이 항상 같은 결과)
 * 5. null에 대한 비 동치성(null 과의 equals 비교시 항상 false 반환 ex : a.equals(null) == false)
 *
 *
 * */
public class Person {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 객체의 동등성을 비교하는 연산자.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }

        if(this.getClass() != obj.getClass()) {
            return false;
        }

        if(this == obj) {
            return true;
        }

        Person that = (Person) obj;

        if(this.name == null && that.name != null) {
            return false;
        }
        if( this.id == that.id && this.name.equals(that.name)) {
            return true;
        }

        return false;
    }
    // 두 객체가 같은 객체인지, 동일성을 비교하는 연산자
    // HashMap 이나 HashSet, HashTable과 같은 객체들을 사용하는 경우, 객체의 의미상의 동등성 비교를 위해
    // HashCode() 호출
    // key로 쓰이는 객체는 Immutable로 써야한다. 객체가 수정된후 의 값을 반영하지 못하기 때문에.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((name == null) ? 0 : name.hashCode());
        System.out.println("Result first : " + result);
        result = prime * result + id;
        System.out.println("Result second : " + result);

        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args){
        Person p1 = new Person();
        p1.setId(1);
        p1.setName("Sam");

        Person p2 = new Person();
        p2.setId(1);
        p2.setName("Sam");

        System.out.println(p1.equals(p2)); // false -> equals을 생성해주기 전

         Map<Person, Integer> map = new HashMap<Person, Integer>();
         map.put(p1, 1);
         map.put(p2, 1);
         System.out.println(map.size()); // 2 -> hashCode를 생성해주기 전에 동일한 객체로 판단하여 1로 예상하였지만 2 출력.



    }
}
