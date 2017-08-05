package helloword.Ch01_Introduction;

public class MovieTestDrive{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title="Как прогореть на акциях";
        one.genre= "Трагедия";
        one.rating=-2;
        one.playIt();
        System.out.println(one.genre);
    }
}
