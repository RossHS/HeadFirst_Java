package helloworld.zd;

/**
 * Created by User on 26.07.2017.
 */
public class zd1_10WorkWithArrays {
    public static void main(String[] args) {
        String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"};
        int[] times = {341, 273, 278, 329, 445, 402, 388, 275,
                243, 334, 412, 393, 299, 343, 317, 265};
        int max = 0;
        int num1 = 0;
            for (int i = 0; i < times.length; i++) {
                if (max < times[i]) {
                    max = times[i];
                    num1 = i;
                }
            }
        System.out.println("Участник " + names[num1] + " его результат: " + times[num1]);
    }
}