package Head_First_Java.Ch03_Primitives_References_Arrays;

/**
 * Created by User on 17.07.2017.
 */
class Dog {
    String name;

    public static void main(String[] args) {
        String name;
        //создали объект типа Dog и получили к нему доступ по ссылке
        Dog dog1= new Dog();
        dog1.bark(); //получили доступ нашего объекта к методу bark()
        dog1.name = "Леня"; //получили доступ к переменной name и занесли тупа значение Леня

        //создадим массив типа Dog
        Dog[] myDogs = new Dog[3];
        //помещаем в наш массив несколько элементов
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1; //для этого куска массива присвоим значение переменной dog1

        //получаем доступ к объктам dog с помощью ссылок из массива
        myDogs[0].name = "Рося";
        myDogs[1].name = "Юлясик";

        System.out.println("Имя последнего годовасика сделавшего кусь - " + myDogs[2].name);

        //Теперь переберем все элементы массива и вызовем для каждого метод bark()
        int x = 0;
        while (x<myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public void bark(){
        System.out.println(name+ " Сделал кусь!");
    }
    public  void eat(){}
    public void chaseCat(){}
}

