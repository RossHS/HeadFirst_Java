package Head_First_Java.Ch03_Primitives_References_Arrays;

/**
 * Created by User on 17.07.2017.
 */
class Books {
    String title;
    String author;
}

class BooksTestDrive{
    public static void main(String[] args) {

        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title="Плоды Java";
        myBooks[1].title="Java pixie";
        myBooks[2].title="Рецепты Java";

        myBooks[0].author="Леня";
        myBooks[1].author="Юля";
        myBooks[2].author="Росс";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
