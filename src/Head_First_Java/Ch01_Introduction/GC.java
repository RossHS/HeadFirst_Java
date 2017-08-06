package Head_First_Java.Ch01_Introduction;

/**
 * Created by User on 25.07.2017.
 */
public class GC {
    private int size;

    public static void main(String[] args) {
        GC n = new GC();
        n.setSize(1);
        System.out.println("degfrew" + n.getSize());
    }

    public void setSize(int s) {
        size = s;
    }
    public int getSize() {
        return size;
    }
}