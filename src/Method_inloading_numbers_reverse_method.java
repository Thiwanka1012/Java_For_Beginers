import java.util.Scanner;

public class Method_inloading_numbers_reverse_method {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Insert Your number");
        int num=input.nextInt();

        System.out.println("Reverse is:"+reverse(num));

    }
    public static int reverse(int number){
        int reverse=0;

        while(number!=0){
            reverse=reverse*10;
            reverse=reverse+number%10;
            number=number/10;
        }
        return reverse;
    }
}
