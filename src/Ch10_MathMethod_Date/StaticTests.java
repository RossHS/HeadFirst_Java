package Ch10_MathMethod_Date;

/**
 * Created by User on 27.07.2017.
 */
class StaticSuper {
    static  {
        System.out.println("родительский статический блок");
    }

     StaticSuper(){
        System.out.println("Родительский конструктор");
    }
}

public class StaticTests extends StaticSuper {
    static  int rand;

    static {
        rand = (int) (Math.random()*6);
        System.out.println("Статический блок" + rand);
    }

    StaticTests(){
        System.out.println("Конструктор");
    }

    public static void main(String[] args) {
        System.out.println("Внутри мейн");
        StaticTests st = new StaticTests();
    }
}