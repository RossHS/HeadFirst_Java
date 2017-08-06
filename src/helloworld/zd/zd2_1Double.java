package helloworld.zd;

import java.util.Scanner;

/**
 * Created by User on 27.07.2017.
 */
public class zd2_1Double {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        //удобная конструкция.
        System.out.println(d + (d % 1 == 0 ? " - целое" : " - не целое"));
    }
}
