package helloworld.zd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by User on 26.07.2017.
 */
public class zd1_8Average {
    public static void main(String[] args) {
        double result = 0; //создаем переменную для конечного результат
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> Mass = new ArrayList<Double>(); //создаем массив
        System.out.println("Укажите длинну массива:");
        int size = scan.nextInt(); //вводим длину массива
        System.out.println("Теперь задайте элементы массива");
        for (int a = 0; a < size; a++){ //запускаем цикл для длины масива
            double elem = scan.nextDouble(); //вводим значение для эллемента массива
            Mass.add(elem); //заносим его в наш массив
        }
        for (int i = 0; i < Mass.size(); i++){ //находим арив сумму членов массива
            result = result + Mass.get(i);
        }
        result = result/Mass.size();
        System.out.println(result);
    }
}
