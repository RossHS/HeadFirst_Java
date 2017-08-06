package Head_First_Java.Ch04_Objects_With_DeferendMethod;

/**
 * Created by User on 18.07.2017.
 */
public class mathTest {
    int a,b;
    mathTest t= new mathTest();
    void go() {
        t.takeTwo(12, 34);
    }

    void takeTwo (int x, int y){
        int z = x + y;
        System.out.println("1Сумма равна " + z);
    }

    void go1() {
        int foo = 7;
        int bar = 3;
        t.takeTwo(foo, bar);
    }
    void takeTwo1(int x, int y) {
        int z = x + y;
        System.out.println("2Сумма равна " + z);
    }
}

