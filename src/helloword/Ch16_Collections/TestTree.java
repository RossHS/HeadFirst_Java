package helloword.Ch16_Collections;
import  java.util.*;
/**
 * Created by User on 05.08.2017.
 */
public class TestTree {
    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go(){
        Book b1 = new Book("Как устроенны кошки");
        Book b2 = new Book("Построй тело");
        Book b3 = new Book("В поисках немо");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable{
    String title;
    public Book(String t){
        title = t;
    }
    public int compareTo(Object b) {
        Book book = (Book) b;
        return (title.compareTo(book.title));
    }
}
