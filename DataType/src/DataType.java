/**
 * Created by gunny on 2017. 6. 19..
 */
public class DataType {

    public static void main(String[] args) {

        /*
            어떤 Datatype으로 변수를 선언 했느냐에 따라서 사용하는 메모리의 크기가 달라지는 것이다.
            결국, 변수에 들어올 수 있는 숫자의 최대 크기를 잘 판단해서 데이터 타입을 지정해야 귀한 메모리의 용량을 아낄수 있다.
            하지만 메모리의 용량은 많이 늘어났고 또, 어떤 데이터형을 사용할 것이냐는 문제를 판단하기 위해서는 여러가지가 고려되어야 한다.
            결과적으로 말해서 정수를 저장할 때는 int를 사용하면 된다.
            int 형을 처리 할 때 CPU의 처리속도가 빠르고, int는 충분히 큰 수를 표현할 수 있는 데이터 타입이기 때문이다.
         */

        /*
            정수형
         */
        byte a;

        // 1byte : -128 ~ 127
        byte district = 1;

        // 2byte : -32768 ~ 32767
        short district_short = 1;

        // 4byte : -2,147,483,648 ~ 2,147,483,647
        int district_int = 1;

        // 8byte : -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        long district_long = 1;


        /*
            실수형
         */

        // 4byte
        float district_float = 1.1f;

        // 8byte
        double district_double = 1.1;


        /*
            char : 2byte, Unicode
            자바에서는 문자와 문자열이 다르다. 문자(character)는 글자 하나를 의미하고, 문자열은 글자들의 집합을 의미한다.
            그럼 문자열은 메모리를 얼마나 사용할까? 문자열은 문자의 집합이라고 했다. 문자는 char형이고, char는 2byte의 메모리를 사용한다.
            따라서 6글자를 담고 있는 String 타입의 변수는 12바이트의 공간을 차지하게 된다.
         */
        char district_char = '1';

        /*
            1. String 클래스의 문자열 저장방식
            2. String 객체의 위치 : Heap Memory
               - 힙 메모리는 프로세스가 실행될 때 운영체제로부터 할당 받게 된다.
               - 자바 프로그램의 경우는 JVM 프로세스 상에서 실행 되므로, JVM이 실행될 때 운영체제로 부터 힙메모리에 할당 받는다.
               - 프로세스 실행 도중에 힙 메모리가 부족하면 JVM이 운영체제로부터 추가로 할당받게 된다.
               - String 객체 내부의 char 형 배열도 역시 힙 메모리 상에 위치하게 된다. 따라서 문자열의 크기에 대한 한계는 힙 메모리의 크기와 관련된다.
         */

        // Str : 12byte / char 1개 -> 2byte(Unicode) * 6char
        String str = "hello!";
        System.out.println(str);

    }
}
