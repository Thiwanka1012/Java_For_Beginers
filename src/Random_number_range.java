import java.util.Random;

public class Random_number_range {
    public static void main(String[] args) {

        Random random = new Random();

        int min = 50;
        int max = 100;

        int x = random.nextInt((max - min) + 1) + min;
        System.out.println(x);
    }
}
