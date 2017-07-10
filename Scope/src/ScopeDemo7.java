/**
 * Created by gunny on 2017. 7. 6..
 */
public class ScopeDemo7 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }
}

class C {
    int v = 10;

    void m() {
        System.out.println(v);
    }
}
