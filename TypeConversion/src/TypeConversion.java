/**
 * Created by gunny on 2017. 6. 19..
 *
 * Type Conversion이란 데이터의 타입을 변경하는 것이다.
 *
 *
 * 00000000 00000000 00000000 11001000 int 200
 * 01000011 01001000 00000000 00000000 float 200.0
 *
 * 이렇게 형식이 다른 데이트들을 더하려면 한쪽의 데이터 타입을 다른쪽의 데이터 타입으로 전화해야한다.
 *
 * 자바는 이러한 형 변환을 자동으로 처리해주는 데 이러한 전환작업을 자동(암시적) 형 변환(implicit Conversion)이라고
 * 부른다.
 */
public class TypeConversion {

    public static void main(String[] args) {
        // 3.0F의 값은 자동으로 double 타입으로 형변환이 일어난다.
        // 이것이 가능한 이유는 double type이 float type보다 더 많은 수를 표현할 수 있기 때문이다.
        // 타입을 변경해도 정보의 손실이 일어나지 않는 경우 자동 형 변환이 일어난다.
        double a = 3.0F;

        // 자동 형 변환의 원칙은 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용
        // float f = 3.0; error

        // byte -> short -> int -> long -> float -> double

        /*
            상수와 상수를 연산한다면 어떻게 될까?
            : 아래의 연산은 두 번의 형 변환이 일어난다.
              우선 i와 f를 더하기 위해서 정수 i와 실수 f중 하나가 형변환을 해야한다.
              위의 그림에 따르면 int와 float가 붙으면 int->float 되기 때문에 변수 i는 float가 된다.

              연산 결과 후 double에 대입되야 하기 때문에 float->double로 자동 형 변환 된다.
         */
        int i = 3;
        float f = 1.0F;
        double d = i + f;



        /*
            명시적 형 변환
            : 자동 형 변환이 되지 않는 경우에는 수동으로 형 변환을 해야한다. 이를 명시적(Explicit Conversion)
              이라고 한다. 아래 예제는 모든 행의 코드에서 오류가 발생한다.
         */
        // float f1 = 100.0; error
        // int b1 = 100.0F; error

        float f1 = (float)100.0;
        int b1 = (int)100.0F;

        // (데이터 타입) 데이터 값 으로 표시하는 것을 명시적인 형 변환이라고 한다.

    }
}
