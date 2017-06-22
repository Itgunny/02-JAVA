/**
 * Created by gunny on 2017. 6. 21..
 *
 * .length는 배열에 실제 담긴 데이터의 숫자를 의미하는 것이 아니라 배열을 처음 생성할 때
 * 지정한 배열의 크기를 의미한다는 점을 주의하자.
 *
 */
public class LengthDemo {
    public static void main(String[] args) {
        String[] classGroup = new String[4];

        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한아람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
    }
}
