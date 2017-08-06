package Ch09_Constructors;

/**
 * Created by User on 04.08.2017.
 */
public class Animal {
    public Animal() {
        System.out.println("Конструктор создает Animal");
    }
}
class Hippo extends Animal {
    public Hippo() {
        System.out.println("Конструктор создает Hippo");
    }
}
class TextHippo {
    public static void main(String[] args) {
        System.out.println("Начало");
        Hippo h = new Hippo();
    }
}