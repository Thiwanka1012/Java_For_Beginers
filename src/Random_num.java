import java.util.Random;

public class Random_num {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Random random=new Random();
            int x= random.nextInt(101); //Because We want get bound 0-100,If you type 100,you can see only random numbeers 0-99

            if (i%2==0){
                System.out.println("Even number"+x);
            }
            else {
                System.out.println("Odd number"+x);
            }
        }
    }
}
