package helloworld.Ch04_Objects_With_DeferendMethod;

/**
 * Created by User on 18.07.2017.
 */
public class GoodDog {

    private int size;

    public int getSize() { //используем сеттеры и гетторы для безопаснеости кода, чтобы не смогли установить недопустимых значений
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void  bark(){
        if (size > 60) {
            System.out.println("ГАВ-ГАВ МАЗАФАКА!");
        } else if (size > 14) {
            System.out.println("ВУФ-ВУФ!");
        } else {
            System.out.println("ТЯФ-ТЯФ!");
        }
    }
}

class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("первая Собака: " + one.getSize());
        one.bark();
        System.out.println("Вторая Собака: " + two.getSize());
        two.bark();
    }
}