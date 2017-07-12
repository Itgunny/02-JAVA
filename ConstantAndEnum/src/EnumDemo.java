/**
 * Created by gunny on 2017. 7. 11..
 *
 * enum은 열거형(enumerated type)이라고 부른다. 열거형은 서로 연관된 상수들의 집합이라고 할 수 있다.
 */
enum Fruit {
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;

    // enum 생성자의 접근 제어자는 private만을 허용하기 때문이다.
    Fruit(String color) {
        System.out.println("Call Constructor " + this);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
enum Company {
    GOOGLE, APPLE, ORACLE;
}
public class EnumDemo {
    public static void main(String[] args) {
        Fruit type = Fruit.APPLE;

        switch (type) {
            case APPLE:
                System.out.println(57 + " kcal" + " " + Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34 + " kcal" + " " + Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93 + " kcal" + " " + Fruit.BANANA.getColor());
                break;
        }

         for(Fruit f : Fruit.values()) {
            System.out.println(f + ", " + f.getColor());
         }
    }

}
