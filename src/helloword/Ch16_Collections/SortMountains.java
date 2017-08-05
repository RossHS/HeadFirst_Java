package helloword.Ch16_Collections;

import java.util.*;

/**
 * Created by User on 05.08.2017.
 */
public class SortMountains {
    LinkedList<Mountaion> mtn = new LinkedList<Mountaion>();

    class NameCompare implements Comparator<Mountaion> {
        public int compare(Mountaion one, Mountaion two){
            return one.name.compareTo(two.name);
        }
    }

    class HeightCompare implements Comparator<Mountaion> {
        public int compare(Mountaion one, Mountaion two){
            return (two.height - one.height);
        }
    }

    public static void main(String[] args) {
        new SortMountains().go();
    }
    public void go() {
        mtn.add(new Mountaion("Лонг-Рейдж", 14255));
        mtn.add(new Mountaion("Эльберт", 14433));
        mtn.add(new Mountaion("Марун", 14156));
        mtn.add(new Mountaion("Касл", 14265));

        System.out.println("В порядке добавления:\n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("По названию:\n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("По названию:\n" + mtn);
    }
}

class Mountaion {
    String name;
    int height;
    Mountaion (String n, int h){
        name = n;
        height = h;
    }
    public String toString(){
        return name + " " + height;
    }
}