import java.util.Scanner;

public class Task2_Find_SumOfDIgitCount {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Insert your Number:");
        int number= input.nextInt();

        int sum=0;
        while(number!=0){
            sum=sum+number%10;
            number=number/10;


        }
        System.out.print("Total Is-"+sum);
    }
}
