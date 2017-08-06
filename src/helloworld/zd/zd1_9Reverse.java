package helloworld.zd;

/**
 * Created by User on 26.07.2017.
 */
public class zd1_9Reverse {
    public static void main(String[] args) {
        String text = "Кусь за ушко";
        StringBuffer rev = new StringBuffer(text); //удобный класс для работы со строками
        rev.reverse();
        System.out.println(rev);
    }
}
