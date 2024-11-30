import java.util.Scanner;

public class Method_inloading_Part4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Insert Your number 01-");
        int num1= input.nextInt();

        System.out.print("insert Your number 02-");
        int num2= input.nextInt();

        calculation(num1,num2);                            //Argument list
    }


    public static void calculation(int x,int y){           //parameter List

        int sum=0;
        sum=x+y;
        System.out.println("Sum is-"+sum);

    }
}
