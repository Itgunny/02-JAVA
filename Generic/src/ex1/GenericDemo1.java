package ex1;

/**
 * Created by gunny on 2017. 7. 12..
 */
class StudentInfo {
    public int grade;
    StudentInfo(int grade) {
        this.grade = grade;
    }
}

class StudentPerson {
    public StudentInfo info;
    StudentPerson(StudentInfo info) {
        this.info = info;
    }
}

class EmployeeInfo {
    public int rank;
    EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class EmployeePerson {
    public EmployeeInfo info;
    EmployeePerson(EmployeeInfo info) {
        this.info = info;
    }
}

class Person<T> {
    public T info;
    Person(T info) { this.info = info; }
}

public class GenericDemo1 {
    public static void main(String args) {
        StudentInfo si = new StudentInfo(2);
        StudentPerson sp = new StudentPerson(si);
        System.out.println(sp.info.grade);

        EmployeeInfo ei = new EmployeeInfo(1);
        EmployeePerson ep = new EmployeePerson(ei);
        System.out.println(ep.info.rank);

        Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank);

        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
        /*

            p2.info가 String이고 String은 rank필드가 없는데 이것을 호출하고 있기 떄문이다.
            컴파일 단계에서 오류가 검출된다.
            중복의 제거와 타입 안전성을 동시에 추구할 수 있게 된다.
            System.out.println(ei2.rank);// 컴파일 실패
        */
    }
}
