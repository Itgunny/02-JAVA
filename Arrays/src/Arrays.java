/**
 * Created by gunny on 2017. 6. 21..
 *
 * 배열은 연관된 데이터를 모아서 관리하기 위해서 사용되는 데이터 타입이다.
 * 변수가 하나의 데이터를 저장하기 위한 것이라면 배열은 여러개의 데이터를 저장하기 위한 것이라고 할 수 있다.
 *
 */
public class Arrays {

    public static void main(String[] args) {

        // classGroup은 배열이 담길 변수의 이름이다 데이터 타입이 문자열의 배열이라는 의미다.
        String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};


        // 배열의 데이터를 가져오는 방법 -> 0 부터 시작하는 숫자를 입력하면 순차적으로 값을 가져올 수 있다.
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);


    }
}
