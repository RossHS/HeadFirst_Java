package helloworld.zd;

import java.util.Scanner;

/**
 * Created by User on 02.08.2017.
 */
public class zd2_4MethodMoney {
    private int  zpperHour;
    private double WorkHours;
    public void setZpperHour(int ph){
        if (ph >= 8){
            zpperHour = ph;
        } else zpperHour = 8;
    }

    public int getZpperHour(){
        return zpperHour;
    }

    public void setWorkHours(double wh){
        if (wh >= 60)
            wh = 60;
        if (wh > 40 && wh <= 60 ){
            WorkHours = (wh - 40)*1.5 + 40;
        }
        else WorkHours = wh;
    }

    public double getWorkHours(){
        return WorkHours;
    }
    public static void main(String[] args) {
       zd2_4MethodMoney a = new zd2_4MethodMoney();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите зп/час (минимальная 8) и кол-во проработанный часов");
        a.setZpperHour(scan.nextInt());
        a.setWorkHours(scan.nextDouble());
       a.money(a.getZpperHour(),a.getWorkHours());
    }
    public void money (int x, double y){
        int zp =(int) (x * y);
        System.out.println("Заработал за неделю:" + zp);
    }
}
