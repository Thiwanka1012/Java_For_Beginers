import java.util.Scanner;

public class Method_inloading_Part2 {
    public static void main(String[] args) {

        sumOfnumbers();

    }

    public static void sumOfnumbers(){
        Scanner input=new Scanner(System.in);
        System.out.print("Input First number-");
        int num1= input.nextInt();

        System.out.print("Input Second number-");
        int num2=input.nextInt();

        int sum=0;
        sum=num1+num2;

        System.out.print("Sum of the numbers-"+sum);
    }
}
