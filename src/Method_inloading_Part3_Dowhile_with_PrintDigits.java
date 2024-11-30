import java.util.Scanner;

public class Method_inloading_Part3_Dowhile_with_PrintDigits {
    public static void main(String[] args) {

        digitCount();

    }

    public static void digitCount(){

        Scanner input=new Scanner(System.in);
        System.out.println("Insert Your number");
        int number = input.nextInt();

        int digits=0;
        do {
            digits++;
        }
        while ((number=number/10)!=-0);
        System.out.println("Digit Count:"+digits);
    }
}
