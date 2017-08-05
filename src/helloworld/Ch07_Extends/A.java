package helloworld.Ch07_Extends;

/**
 * Created by User on 23.07.2017.
 */
class A {
    int ivar = 7;
    void m1() {
        System.out.print("A m1, ");
    }
    void m2(){
        System.out.print("A m2, ");
    }
    void m3(){
        System.out.print("A m3, ");
    }
}

class B extends A {
    void m1() {
        System.out.print("B m1, ");
    }
}

class C extends B {
    void m3() {
        System.out.print("C m3, " + (ivar +6));
    }
}

