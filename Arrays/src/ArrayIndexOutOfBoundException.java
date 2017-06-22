/**
 * Created by gunny on 2017. 6. 22..
 *
 * 배열이 수용할 수 있는 범위를 넘어 설때 나오는 에러
 *
 * 배열의 한계
 *  - 배열은 초기화할 때 그 크기가 정해진다. 그래서 정해진 크기 이상의 값을 넣을 수 없다.
 *
 */
public class ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        String[] member = {"최진혁", "최유빈", "한아람"};

        System.out.println(member[3]);
        // Exception in thread "main java.lang.ArrayIndexOutOfBoundsException :


    }
}
