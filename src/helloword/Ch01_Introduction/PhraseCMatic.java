package helloword.Ch01_Introduction;

/**
 * Created by User on 15.07.2017.
 */
public class PhraseCMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"лучшая", "няшная", "крутая", "милая", "любимая"};
        String[] wordListTwo = {"самая"};
        String[] wordListThree = {"Юля", "Юлясик", "мусик", "Пикси", "кисик", "писик"};
        int x = 0;
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        while (x < 5) {
            int rand1 = (int) (Math.random() * oneLength);
            int rand2 = (int) (Math.random() * twoLength);
            int rand3 = (int) (Math.random() * threeLength);

            String phrase = wordListThree[rand3] + " " + wordListTwo[rand2] + " " + wordListOne[rand1];
            System.out.println("Все, что нам нужно знать, что " + phrase);
            x=x+1;
        }
    }
}