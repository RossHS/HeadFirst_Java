package helloworld.Ch04_Objects_With_DeferendMethod;

/**
 * Created by User on 18.07.2017.
 */
class Dog {
    int size;
    String name;

    void bark(){
        if (size > 60) { //просто передаем значения методу
            System.out.println( name + " Гав-Гав!");
        } else if (size > 14) {
            System.out.println( name + " Вуф-Вуф!");
        } else {
            System.out.println( name + " Тяф-Тяф!");
        }
    }
}
class DogTestDrive{

    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        one.name = "Убийца";

        Dog two = new Dog();
        two.size = 8;
        two.name = "Леня";

        Dog three = new Dog();
        three.size = 35;
        three.name = "Дядя пес";

        one.bark();
        two.bark();
        three.bark();

    }
}